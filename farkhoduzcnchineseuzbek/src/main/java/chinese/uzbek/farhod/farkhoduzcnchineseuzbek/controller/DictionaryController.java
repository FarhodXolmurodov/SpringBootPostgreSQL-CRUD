package chinese.uzbek.farhod.farkhoduzcnchineseuzbek.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import chinese.uzbek.farhod.farkhoduzcnchineseuzbek.exception.ResourceNotFoundException;
import chinese.uzbek.farhod.farkhoduzcnchineseuzbek.model.UzbekChineseDictionary;
import chinese.uzbek.farhod.farkhoduzcnchineseuzbek.repository.DictionaryRepository;

@RestController
@RequestMapping("/api/data")
public class DictionaryController {

	@Autowired
	private DictionaryRepository dictionaryRepository;

	@GetMapping("/dictionary")
	public List<UzbekChineseDictionary> getAllUuzbekChineseDictionarys() {
		return this.dictionaryRepository.findAll();
	}

	@GetMapping("/dictionary/{id}")
	public ResponseEntity<UzbekChineseDictionary> getUzbekChineseDictionaryById(@PathVariable(value = "id") Long dictionaryId)
			throws ResourceNotFoundException {
		UzbekChineseDictionary uzbekChineseDictionary = dictionaryRepository.findById(dictionaryId)
				.orElseThrow(() -> new ResourceNotFoundException("Dictionary not found for this id: " + dictionaryId));
		return ResponseEntity.ok().body(uzbekChineseDictionary);
	}

	@PostMapping("/dictionary")
	public UzbekChineseDictionary createUzbekChineseDictionary(@RequestBody UzbekChineseDictionary UzbekChineseDictionary) {
		return dictionaryRepository.save(UzbekChineseDictionary);
	}

	@PutMapping("/dictionary/{id}")
	public ResponseEntity<UzbekChineseDictionary> updateUzbekChineseDictionary(@PathVariable(value = "id") Long dictionaryId,
			@RequestBody UzbekChineseDictionary uzbekChineseDictionaryDetails) throws ResourceNotFoundException {
		UzbekChineseDictionary uzbekChineseDictionary = dictionaryRepository.findById(dictionaryId)
				.orElseThrow(() -> new ResourceNotFoundException("Dictionary not found for this id: " + dictionaryId));

		//uzbekChineseDictionary.setId(uzbekChineseDictionaryDetails.getId());
		uzbekChineseDictionary.setCreateDate(uzbekChineseDictionaryDetails.getCreateDate());
		
		uzbekChineseDictionary.setCharacter(uzbekChineseDictionaryDetails.getCharacter());
		uzbekChineseDictionary.setPinyin(uzbekChineseDictionaryDetails.getPinyin());
		uzbekChineseDictionary.setMeaning(uzbekChineseDictionaryDetails.getMeaning());
		
		uzbekChineseDictionary.setPartOfSpeech(uzbekChineseDictionaryDetails.getPartOfSpeech());
		uzbekChineseDictionary.setMeasureWord(uzbekChineseDictionaryDetails.getMeasureWord());
		uzbekChineseDictionary.setRelatedWord(uzbekChineseDictionaryDetails.getRelatedWord());
		
		uzbekChineseDictionary.setCharacterExampleOne(uzbekChineseDictionaryDetails.getCharacterExampleOne());
		uzbekChineseDictionary.setPinyinExampleOne(uzbekChineseDictionaryDetails.getPinyinExampleOne());
		uzbekChineseDictionary.setMeaningExampleOne(uzbekChineseDictionaryDetails.getMeaningExampleOne());
		
		uzbekChineseDictionary.setCharacterExampleTwo(uzbekChineseDictionaryDetails.getCharacterExampleTwo());
		uzbekChineseDictionary.setPinyinExampleTwo(uzbekChineseDictionaryDetails.getPinyinExampleTwo());
		uzbekChineseDictionary.setMeaningExampleTwo(uzbekChineseDictionaryDetails.getMeaningExampleTwo());
		
		uzbekChineseDictionary.setCharacterExampleThree(uzbekChineseDictionaryDetails.getCharacterExampleThree());
		uzbekChineseDictionary.setPinyinExampleThree(uzbekChineseDictionaryDetails.getPinyinExampleThree());
		uzbekChineseDictionary.setMeaningExampleThree(uzbekChineseDictionaryDetails.getMeaningExampleThree());
		
		final UzbekChineseDictionary updatedUzbekChineseDictionary = dictionaryRepository.save(uzbekChineseDictionary);
		return ResponseEntity.ok(updatedUzbekChineseDictionary);
	}

	@DeleteMapping("/dictionary/{id}")
	public Map<String, Boolean> deleteUzbekChineseDictionary(@PathVariable(value = "id") Long dictionaryId)
			throws ResourceNotFoundException {
		UzbekChineseDictionary uzbekChineseDictionary = dictionaryRepository.findById(dictionaryId)
				.orElseThrow(() -> new ResourceNotFoundException("Dictionary not found for this id :: " + dictionaryId));
		dictionaryRepository.delete(uzbekChineseDictionary);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
	
}
