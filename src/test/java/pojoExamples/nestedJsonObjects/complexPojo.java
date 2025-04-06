package pojoExamples.nestedJsonObjects;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;


public class complexPojo 
{
	@JsonProperty("glossary")
    private Glossary glossary;
 
	@JsonProperty("glossary")
    public Glossary getGlossary() 
    {
        return glossary;
    }
	@JsonProperty("glossary")
    public void setGlossary(Glossary glossary) 
    {
        this.glossary = glossary;
    }
    
   static public class Glossary
    {
	   @JsonProperty("title")
        private String title;
	   @JsonProperty("GlossDiv")
        private GlossDiv glossDiv;
        
	   //Glossary(){};
	   @JsonProperty("title")
        public String getTitle() {
            return title;
        }
	   @JsonProperty("title")
        public void setTitle(String title) {
            this.title = title;
        }
	   @JsonProperty("GlossDiv")
        public GlossDiv getGlossDiv() {
            return glossDiv;
        }
	   @JsonProperty("GlossDiv")
        public void setGlossDiv(GlossDiv glossDiv) {
            this.glossDiv = glossDiv;
        }
    }
    
   static  public class GlossDiv
    {
	   @JsonProperty("title")
        private String title;
        
        @JsonProperty("GlossList")
        private GlossList glossList;
        
        GlossDiv(){};
        
        @JsonProperty("title")
        public String getTitle() {
            return title;
        }
        @JsonProperty("title")
        public void setTitle(String title) {
            this.title = title;
        }
        @JsonProperty("GlossList")
        public GlossList getGlossList() {
            return glossList;
        }
        @JsonProperty("GlossList")
        public void setGlossList(GlossList glossList) {
            this.glossList = glossList;
        }
    }
    
   static public class GlossList 
    {
	   @JsonProperty("GlossEntry")
        private GlossEntry glossEntry;
        
        GlossList(){};
        
        @JsonProperty("GlossEntry")
        public GlossEntry getGlossEntry() {
            return glossEntry;
        }
        @JsonProperty("GlossEntry")
        public void setGlossEntry(GlossEntry glossEntry) {
            this.glossEntry = glossEntry;
        }
    }
    
   static   public class GlossEntry 
    {
	   @JsonProperty("ID") 
	   private String iD;
	   
	   @JsonProperty("SortAs") 
        private String sortAs;
	   @JsonProperty("GlossTerm") 
        private String glossTerm;
	   
	   @JsonProperty("Acronym") 
        private String acronym;
	   
	   @JsonProperty("Abbrev")
        private String abbrev;
	   
	   @JsonProperty("GlossDef")
        private GlossDef glossDef;
	   
	   @JsonProperty("GlossSee")
        private String glossSee;
        
        GlossEntry(){};
        @JsonProperty("ID") 
        public String getID() {
            return iD;
        }
        @JsonProperty("ID") 
        public void setID(String iD) {
            this.iD = iD;
        }
        @JsonProperty("SortAs") 
        public String getSortAs() {
            return sortAs;
        }
        @JsonProperty("SortAs") 
        public void setSortAs(String sortAs) {
            this.sortAs = sortAs;
        }
        @JsonProperty("GlossTerm") 
        public String getGlossTerm() {
            return glossTerm;
        }
        @JsonProperty("GlossTerm") 
        public void setGlossTerm(String glossTerm) {
            this.glossTerm = glossTerm;
        }
        @JsonProperty("Acronym") 
        public String getAcronym() {
            return acronym;
        }
        @JsonProperty("Acronym") 
        public void setAcronym(String acronym) {
            this.acronym = acronym;
        }
        @JsonProperty("Abbrev")
        public String getAbbrev() {
            return abbrev;
        }
        @JsonProperty("Abbrev")
        public void setAbbrev(String abbrev) {
            this.abbrev = abbrev;
        }
        @JsonProperty("GlossDef")
        public GlossDef getGlossDef() {
            return glossDef;
        }
        @JsonProperty("GlossDef")
        public void setGlossDef(GlossDef glossDef) {
            this.glossDef = glossDef;
        }
        @JsonProperty("GlossSee")
        public String getGlossSee() {
            return glossSee;
        }
        @JsonProperty("GlossSee")
        public void setGlossSee(String glossSee) {
            this.glossSee = glossSee;
        }
    }

    
   static  public class GlossDef 
    {
	   @JsonProperty("para")
        private String para;
	   @JsonProperty("GlossSeeAlso")
        private List<String> glossSeeAlso = new ArrayList<String>();
        
        GlossDef(){};
        @JsonProperty("para")
        public String getPara() {
            return para;
        }
        @JsonProperty("para")
        public void setPara(String para) {
            this.para = para;
        }
        @JsonProperty("GlossSeeAlso")
        public List<String> getGlossSeeAlso() {
            return glossSeeAlso;
        }
        @JsonProperty("GlossSeeAlso")
        public void setGlossSeeAlso(List<String> glossSeeAlso) {
            this.glossSeeAlso = glossSeeAlso;
        }
    }
    

}


