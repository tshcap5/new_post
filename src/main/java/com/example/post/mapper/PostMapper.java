package com.example.post.mapper;

import com.example.post.model.Post;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface PostMapper {
    List<Post> getList();

    boolean insert(Post vo);

    boolean delete(Integer idx);
}
