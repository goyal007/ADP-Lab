def Eval(list1):
    stack_oper = []
    stack_val=[]
    number = ""
    str1="0123456789."
    str2="+-*/"
    while (len(list1) !=0):
        element_pop=list1.pop(0)
        if element_pop in str1:
            number += element_pop
        else:
            if number != "":
                stack_val.append(number)
                number = ""
            if element_pop in str2:
                stack_oper.append(element_pop)
            if element_pop=='(':
                stack_oper.append(element_pop)
            elif element_pop == ")":
                while (len(stack_oper)!=0 and stack_oper[len(stack_oper)-1]!="("):
                    
                    number2 = stack_val.pop()
                    operator = stack_oper.pop()
                    number1 = stack_val.pop()
                    if operator == "+":
                        stack_val.append(str(float(number1) + float(number2)))
                    elif operator == "-":
                        stack_val.append(str(float(number1) - float(number2)))
                    elif operator == "*":
                        stack_val.append(str(float(number1) * float(number2)))
                    elif operator == "/":
                        if (float(number2)==0):
                                exit(1)
                        stack_val.append(str(float(number1) / float(number2)))
                stack_oper.pop()
    return stack_val.pop()
#"(2+((3*10)/(15-13)))"      "((2+3)+(((4-9))))"
expression ="(2+((3*10)/(15-13)))"
print (expression)
expression = list(expression)
print (Eval(expression))
