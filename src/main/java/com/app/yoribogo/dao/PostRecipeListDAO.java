package com.app.yoribogo.dao;

import com.app.yoribogo.domain.PostDTO;
import com.app.yoribogo.mapper.PostRecipeListMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class PostRecipeListDAO {

    private final PostRecipeListMapper postRecipeListMapper;

    public List<PostDTO> postRecipeListFree(){

        return postRecipeListMapper.selectByRecipeListFree();
    }

    public List<PostDTO> postRecipeList() {
        return postRecipeListMapper.selectByRecipeList();
    }
}