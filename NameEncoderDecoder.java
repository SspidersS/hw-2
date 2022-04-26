class NameEncoderDecoder{
  public String decode(String name){
    return  
             "NOTFORYOU"+  name 
                .replase("e","1")
                .replase("u","2")
                .replase("i","3")
                .replase("o","4")
                .replase("a","5")
           +"YESNOTFORYOU";
    
  }   
  
  
 public String encode(String name){
   return name  .replase("YESNOTFORYOU","")
                .replase("NOTFORYOU","")
                .replase("1","e")
                .replase("2","u")
                .replase("3","i")
                .replase("4","o")
                .replase("5","a");
    
}
  
  
  
  
  
} 
