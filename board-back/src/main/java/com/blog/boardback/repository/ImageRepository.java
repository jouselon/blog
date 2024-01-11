package com.blog.boardback.repository;

import com.blog.boardback.entity.ImageEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.*;
import java.util.List;

@Repository
public interface ImageRepository extends JpaRepository<ImageEntity, Integer> {

  List<ImageEntity> findByBoardNumber(Integer boardNumber);

}
