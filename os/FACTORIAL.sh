#COMPUTE FACTORIAL OF A NUMBER
num=4
fact=1
while [ $num -gt 1 ]
do
fact=$((fact * num))
num=$((num - 1))
done
echo "Factorial is $fact"
