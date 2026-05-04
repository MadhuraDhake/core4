object Sample {
    def main(args: Array[String]) {  
        var ch:Char=0
        var num1:Int=0
        var num2:Int=0
        var result:Int=0
        
        
        print("Choose operation to perform (+,-,*,/,%): ")
        ch=scala.io.StdIn.readChar()
        
        print("Enter first number: ")
        num1=scala.io.StdIn.readInt()
        
        print("Enter second number: ")
        num2=scala.io.StdIn.readInt()
        
        ch match{
            case '+'=> result=num1+num2 
            case '-'=> result=num1-num2
            case '*'=> result=num1*num2
            case '/'=> result=num1/num2
            case '%'=> result=num1%num2
            case _=>printf("Invalid operation.\n")
        }
        println("Result: "+result);
    }
}