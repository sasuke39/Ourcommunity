package springcloud.Service;

import com.atguigu.springcloud.pojo.Comment;
import org.apache.ibatis.annotations.Param;

public interface CommentService {
    int createComment(Comment comment);
    Comment getCommentById(@Param("id") Integer id);
    int deleteCommentById(@Param("id") Integer id);
    int updateComment(@Param("comment") Comment comment);
}
