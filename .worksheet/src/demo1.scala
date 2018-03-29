object demo1 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(58); 
  println("Welcome to the Scala worksheet");$skip(26); 
  println("Hello World!");$skip(12); 
 	var d=3.2;System.out.println("""d  : Double = """ + $show(d ));$skip(89); 
 	var str ="""nifsdfsjfsla
 		|fjsakfjsk
 	|gsakfjsla""".stripMargin.replaceAll("\n","");System.out.println("""str  : String = """ + $show(str ));$skip(38); 
 	
   var s1="""this is my "phone"""";System.out.println("""s1  : String = """ + $show(s1 ));$skip(42); 
   var s2="abcdefg".split("").map(_.trim);System.out.println("""s2  : Array[String] = """ + $show(s2 ));$skip(23); 
   val name = "Gannon";System.out.println("""name  : String = """ + $show(name ));$skip(15); 
   val age = 0;System.out.println("""age  : Int = """ + $show(age ));$skip(27); 
   val addrees = "SiChuan";System.out.println("""addrees  : String = """ + $show(addrees ));$skip(98); 
   //字符串插值s方法 （字符串前跟s字符）可以对变量或字段进行直接在字符串内部进行变量替换
   println(s"my name is $name,age is ${23+age}")
   case class Students(name :String,age :Int);$skip(84); 
   val jack = new Students("Jack",18);System.out.println("""jack  : demo1.Students = """ + $show(jack ));$skip(89); 
   //注意：打印字段时需要对器字段包裹在花括号中
   println(s"you are name`s ${jack.name},age is ${jack.age}");$skip(114); 
	//字符串插值f方法（字符串前跟f字符） 通过字符串插值可以给需要打印的变量或对象字段进行格式化
	println(f"you are name`s ${jack.name},age is ${jack.age}%.2f")}
}
