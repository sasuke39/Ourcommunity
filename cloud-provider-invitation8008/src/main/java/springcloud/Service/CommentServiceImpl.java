package springcloud.Service;

import com.atguigu.springcloud.dao.CommentMapper;
import com.atguigu.springcloud.pojo.Comment;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CommentServiceImpl implements CommentService {

    @Resource
    CommentMapper commentMapper;
    @Override
    public int createComment(Comment comment) {
        return commentMapper.insert(comment);
    }

    @Override
    public Comment getCommentById(Integer id) {
        return commentMapper.selectByPrimaryKey(id);
    }

    @Override
    public int deleteCommentById(Integer id) {
        return commentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateComment(Comment comment) {
        return commentMapper.updateByPrimaryKey(comment);
    }
}
