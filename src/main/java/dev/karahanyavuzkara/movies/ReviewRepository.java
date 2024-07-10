package dev.karahanyavuzkara.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import javax.print.attribute.standard.JobKOctets;
@Repository
public interface ReviewRepository extends MongoRepository<Review, ObjectId> {
}
