/*
 *  Copyright (C) 2017 MINDORKS NEXTGEN PRIVATE LIMITED
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      https://mindorks.com/license/apache-v2
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License
 */

package com.mindorks.framework.mvvm.data.local.db.dao;

import com.mindorks.framework.mvvm.data.model.db.Question;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import java.util.List;

/**
 * Created by amitshekhar on 08/07/17.
 */
@Dao
public interface QuestionDao {

  @Insert(onConflict = OnConflictStrategy.REPLACE)
  void insert(Question question);

  @Insert(onConflict = OnConflictStrategy.REPLACE)
  void insertAll(List<Question> questions);

  @Query("SELECT * FROM questions")
  List<Question> loadAll();
}
