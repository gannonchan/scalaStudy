

class floatCompute {
   def floatCompute(double :Double): Double = {
  //得到浮点数的字符串形式
    var fs = double.toString()
    //得到浮点数字符串形式的长度
    var length = fs.length()
    //得到浮点数小数点的位置
    var index = fs.indexOf(".")
   //得到小数部分
   // var doubleStr = fs.substring(index+1)
    //得到整数部分
    //var intStr = fs.substring(0,index)
    //得到小数部分的长度
    var flength = length-(index+1)
    //将整数部分字符串和小数部分字符串拼接得到一个新的字符串
    var newStr = fs.replace(".","")
    //将字符串转换为数字Int
    var num = Integer.parseInt(newStr).intValue()
    //将数字转换成浮点数
    var initNum :Double = num/Math.pow(10,flength)
    initNum
	}
}
