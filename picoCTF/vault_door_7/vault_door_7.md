

# PicoCTF \ Reverse-Engineering \ VaultDoor7 \ Write-Up 

## Description
This vault uses bit shifts to convert a password string into an array of integers
<br></br>
![300px-Rotate_left_logically svg](https://github.com/boranakova/ctf/assets/56170942/42f3a3ad-c8b6-4ea7-a012-44f1f8b9fca3)

> NOTE : You should examine the source code comments given by this level for understanding the theory of <p>bit shifting</p> Characters are stored by integer.
> So we need to make some conversion process underlying bytes then splitting about 4 pieces in binary level.


SOLUTION 


> I did one variable manually then I created automation script in Python below. 

```python
myarr1 = [1096770097,1952395366,1600270708,1601398833, 1716808014,1734293296,842413104,1684157793]
myarr2 = []
password =""
for item in myarr1:
temp = bin(item) .replace("Ob", "0")
fst = temp[0:8:11]
sed = temp[8:16:11]
thd = temp[16:24:1]
fth = temp[24::]
myarr2.append(int (fst‚2))
myarr2.append(int (scd, 2))
myarr2.append (int (thd, 2))
myarr2.append (int (fth, 2))
  for item in myarr2:
password = password + ""+chr(item)
print("picoCTF{{}}).format(join(password)))
```

> The output will look like this : 
<br></br>
![VaultDoor7_Solution](https://github.com/boranakova/ctf/assets/56170942/6694643a-258a-48e4-ac0d-df87995553b4)

<br></br>

> Also If you manage to extract in decimal level. You can search a website like " decimal/ascii conversion " keyword. Then paste your output in there.

<br></br>

![VaultDoor7_Solution2](https://github.com/boranakova/ctf/assets/56170942/a85248ad-1f24-4251-9890-5a4a8469f0aa)

> Also don't forget to add picoCTF{ first 
