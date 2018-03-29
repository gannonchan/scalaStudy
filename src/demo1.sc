object demo1 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  println("Hello World!")                         //> Hello World!
 	var d=3.2                                 //> d  : Double = 3.2
 	var str ="""nifsdfsjfsla
 		|fjsakfjsk
 	|gsakfjsla""".stripMargin.replaceAll("\n","")
                                                  //> str  : String = nifsdfsjfslafjsakfjskgsakfjsla
 	
   var s1="""this is my "phone""""                //> s1  : String = this is my "phone"
   var s2="abcdefg".split("").map(_.trim)         //> s2  : Array[String] = Array(a, b, c, d, e, f, g)
   val name = "Gannon"                            //> name  : String = Gannon
   val age = 0                                    //> age  : Int = 0
   val addrees = "SiChuan"                        //> addrees  : String = SiChuan
   //字符串插值s方法 （字符串前跟s字符）可以对变量或字段进行直接在字符串内部进行变量替换
   println(s"my name is $name,age is ${23+age}")  //> my name is Gannon,age is 23
   case class Students(name :String,age :Int)
   val jack = new Students("Jack",18)             //> jack  : demo1.Students = Students(Jack,18)
   //注意：打印字段时需要对器字段包裹在花括号中
   println(s"you are name`s ${jack.name},age is ${jack.age}")
                                                  //> you are name`s Jack,age is 18
	//字符串插值f方法（字符串前跟f字符） 通过字符串插值可以给需要打印的变量或对象字段进行格式化
	println(f"you are name`s ${jack.name},age is ${jack.age}%.2f")
                                                  //> you are name`s Jack,age is 18.00
}