package com.example.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPeople is a Querydsl query type for People
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QPeople extends EntityPathBase<People> {

    private static final long serialVersionUID = 965040361;

    public static final QPeople people = new QPeople("people");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public QPeople(String variable) {
        super(People.class, forVariable(variable));
    }

    public QPeople(Path<? extends People> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPeople(PathMetadata<?> metadata) {
        super(People.class, metadata);
    }

}

