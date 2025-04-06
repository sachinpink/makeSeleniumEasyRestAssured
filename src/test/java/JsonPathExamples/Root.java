package JsonPathExamples;

import java.util.ArrayList;

import java.util.List;


public class Root
{
    private String id;
    private String type;
    private String name;
    private Batters batters;
    private List<Topping> topping;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Batters getBatters() {
        return batters;
    }
    public void setBatters(Batters batters) {
        this.batters = batters;
    }
    public List<Topping> getTopping() {
        return topping;
    }
    public void setTopping(List<Topping> topping) {
        this.topping = topping;
    }
    public class Batters 
    {
        private List<Batter> batter;
        
        public List<Batter> getBatter() {
            return batter;
        }
        public void setBatter(List<Batter> batter)
        {
            this.batter = batter;
        }
        
        public class Batter 
        {
            private List<String> id;
            private String type;
            public List<String> getId() {
                return id;
            }
            public void setId(List<String> id) {
                this.id = id;
            }
            public String getType() {
                return type;
            }
            public void setType(String type) {
                this.type = type;
            }
        }
    }
    public class Topping {
        private String id;
        private List<String> type ;
        public String getId() {
            return id;
        }
        public void setId(String id) {
            this.id = id;
        }
        public List<String> getType() {
            return type;
        }
        public void setType(List<String> type) {
            this.type = type;
        }
}
    	
    public static void main(String args [])
    {
    	
    
    	
    }

}