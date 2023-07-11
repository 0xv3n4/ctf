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
