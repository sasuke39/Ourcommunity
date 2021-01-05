package springcloud.contorller;

import com.atguigu.springcloud.Service.CommentService;
import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.pojo.Comment;
import com.atguigu.springcloud.resultCode.ResultData;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.Validate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@Slf4j  //日志
public class CommentController {
    private static final Logger logger = LoggerFactory.getLogger(CommentController.class);

    @Value("${server.port}")
    private String serverPort;
    @Resource
    private CommentService commentService;

    @Resource
    private DiscoveryClient discoveryClient;
    //前后端分离，所以不能直接返回对象，数据要先经过CommonResult封装再返回
    @PostMapping("/comment/create")
    public CommonResult create(@RequestBody Comment comment){//RequestBody注解可以将请求体中对对应的JSON字符串绑定到相应的Bean上
        Validate.notNull(comment,"user不能为空");
        int result = commentService.createComment(comment);
        logger.info("******插入的数据为：" + comment);
        logger.info("******插入结果：" + result);

        if(result > 0){
            //插入成功
            return new CommonResult(ResultData.SUCCESS, "插入数据库成功",serverPort,result);
        }else{
            return new CommonResult(ResultData.FAILED, "插入数据库失败",serverPort);
        }
    }
    @GetMapping("/comment/get/{id}")
    public CommonResult getUserById(@PathVariable("id") Integer id){
        Validate.isTrue(id==null||id <= 0,"id不合规范");
        Comment comment = commentService.getCommentById(id);
        logger.info("******查询结果：" + comment);

        if(comment != null){
            //查询成功
            return new CommonResult(ResultData.SUCCESS, "查询成功,serverPort:",serverPort, comment);
        }else{
            return new CommonResult(ResultData.NOTFOUND, "没有对应记录，查询ID："+id,serverPort);
        }
    }
    @PostMapping("/comment/update")
    public CommonResult updateUser(@RequestBody Comment comment){
        Validate.notNull(comment,"user不能为空");
        int update = commentService.updateComment(comment);
        CommonResult result = new CommonResult<>();
        if (update<=0){
            result.setCode(ResultData.FAILED);
            return result;
        }else {
            result.setCode(ResultData.SUCCESS);
        }
        return  result;
    }
    @PostMapping("/comment/delete/{id}")
    public CommonResult deleteUser(@PathVariable("id") Integer id){
        Validate.notNull(id,"id不能为空");
        int delete = commentService.deleteCommentById(id);
        if (delete<=0){
            return new CommonResult(ResultData.FAILED,"删除对应评论失败",serverPort);
        }else {
            return new CommonResult(ResultData.SUCCESS,"成功删除评论id",serverPort);
        }
    }
}
