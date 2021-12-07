package chinese.uzbek.farhod.farkhoduzcnchineseuzbek.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import chinese.uzbek.farhod.farkhoduzcnchineseuzbek.model.UzbekChineseDictionary;

@Repository
public interface DictionaryRepository extends JpaRepository<UzbekChineseDictionary,Long> {

}
