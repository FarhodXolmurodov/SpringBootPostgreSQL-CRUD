package chinese.uzbek.farhod.farkhoduzcnchineseuzbek.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "dictionary")
public class UzbekChineseDictionary {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
//	@Column(name = "data")
//	@DateTimeFormat(pattern="dd/MM/yyyy")
//  private long id;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date CreateDate = new Date(System.currentTimeMillis());

	@Column(name = "character",nullable = false)
    private String character;
	
	@Column(name = "pinyin")
    private String pinyin;
	
	@Column(name = "meaning",nullable = false)
    private String meaning;

	@Column(name = "part_of_speech")
    private String partOfSpeech;
	
	@Column(name = "measure_word")
    private String measureWord;
	
	@Column(name = "related_word")
    private String relatedWord;

	@Column(name = "character_example_one")
    private String characterExampleOne;
	
	@Column(name = "pinyin_example_one")
    private String pinyinExampleOne;
	
	@Column(name = "meaning_example_one")
    private String meaningExampleOne;

	@Column(name = "character_example_two")
    private String characterExampleTwo;
	
	@Column(name = "pinyin_example_two")
    private String pinyinExampleTwo;
	
	@Column(name = "meaning_example_two")
    private String meaningExampleTwo;

	@Column(name = "character_example_three")
    private String characterExampleThree;
	
	@Column(name = "pinyin_example_three")
    private String pinyinExampleThree;
	
	@Column(name = "meaning_example_three")
    private String meaningExampleThree;
    
	public UzbekChineseDictionary() {
		super();
	}

	public UzbekChineseDictionary(String character, String pinyin, String meaning, String partOfSpeech,
			String measureWord, String relatedWord, String characterExampleOne, String pinyinExampleOne,
			String meaningExampleOne, String characterExampleTwo, String pinyinExampleTwo, String meaningExampleTwo,
			String characterExampleThree, String pinyinExampleThree, String meaningExampleThree) {
		super();
		this.character = character;
		this.pinyin = pinyin;
		this.meaning = meaning;
		this.partOfSpeech = partOfSpeech;
		this.measureWord = measureWord;
		this.relatedWord = relatedWord;
		this.characterExampleOne = characterExampleOne;
		this.pinyinExampleOne = pinyinExampleOne;
		this.meaningExampleOne = meaningExampleOne;
		this.characterExampleTwo = characterExampleTwo;
		this.pinyinExampleTwo = pinyinExampleTwo;
		this.meaningExampleTwo = meaningExampleTwo;
		this.characterExampleThree = characterExampleThree;
		this.pinyinExampleThree = pinyinExampleThree;
		this.meaningExampleThree = meaningExampleThree;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getCreateDate() {
		return CreateDate;
	}

	public void setCreateDate(Date CreateDate) {
		this.CreateDate = CreateDate;
	}

	public String getCharacter() {
		return character;
	}

	public void setCharacter(String character) {
		this.character = character;
	}

	public String getPinyin() {
		return pinyin;
	}

	public void setPinyin(String pinyin) {
		this.pinyin = pinyin;
	}

	public String getMeaning() {
		return meaning;
	}

	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}

	public String getPartOfSpeech() {
		return partOfSpeech;
	}

	public void setPartOfSpeech(String partOfSpeech) {
		this.partOfSpeech = partOfSpeech;
	}

	public String getMeasureWord() {
		return measureWord;
	}

	public void setMeasureWord(String measureWord) {
		this.measureWord = measureWord;
	}

	public String getRelatedWord() {
		return relatedWord;
	}

	public void setRelatedWord(String relatedWord) {
		this.relatedWord = relatedWord;
	}

	public String getCharacterExampleOne() {
		return characterExampleOne;
	}

	public void setCharacterExampleOne(String characterExampleOne) {
		this.characterExampleOne = characterExampleOne;
	}

	public String getPinyinExampleOne() {
		return pinyinExampleOne;
	}

	public void setPinyinExampleOne(String pinyinExampleOne) {
		this.pinyinExampleOne = pinyinExampleOne;
	}

	public String getMeaningExampleOne() {
		return meaningExampleOne;
	}

	public void setMeaningExampleOne(String meaningExampleOne) {
		this.meaningExampleOne = meaningExampleOne;
	}

	public String getCharacterExampleTwo() {
		return characterExampleTwo;
	}

	public void setCharacterExampleTwo(String characterExampleTwo) {
		this.characterExampleTwo = characterExampleTwo;
	}

	public String getPinyinExampleTwo() {
		return pinyinExampleTwo;
	}

	public void setPinyinExampleTwo(String pinyinExampleTwo) {
		this.pinyinExampleTwo = pinyinExampleTwo;
	}

	public String getMeaningExampleTwo() {
		return meaningExampleTwo;
	}

	public void setMeaningExampleTwo(String meaningExampleTwo) {
		this.meaningExampleTwo = meaningExampleTwo;
	}

	public String getCharacterExampleThree() {
		return characterExampleThree;
	}

	public void setCharacterExampleThree(String characterExampleThree) {
		this.characterExampleThree = characterExampleThree;
	}

	public String getPinyinExampleThree() {
		return pinyinExampleThree;
	}

	public void setPinyinExampleThree(String pinyinExampleThree) {
		this.pinyinExampleThree = pinyinExampleThree;
	}

	public String getMeaningExampleThree() {
		return meaningExampleThree;
	}

	public void setMeaningExampleThree(String meaningExampleThree) {
		this.meaningExampleThree = meaningExampleThree;
	}
	
	@Override
	public String toString() {
		return "Xatolik ";
	}
}
