# PicoCTF \ Reverse-Engineering \ droids-1 \ Write-Up

> You need to install Android Studio and the Emulator for this level. Also you need to reverse engineering tool for decoding the binary code of the .apk file.


Using apktool is an optimal tool for this level and the hint already sharing that information. 



```ps
apktool d one.apk
...
apktool b one 
```

When decoding is finished , decoded .apk file is be able to analyze via jadx-gui panel or online apk-decompiler like below.

![2](https://github.com/boranakova/ctf/assets/56170942/002dd5ef-f3c5-4738-892a-f61b5a28b7dd)


The buttonClick method is a flag activator. So examining properly will give the flag.

> When the button triggered , the class called FlagstaffHill executes their method called getFlag() and the output will be shown.

![3](https://github.com/boranakova/ctf/assets/56170942/c05c43d0-d788-4ecc-8f90-b71bf4a4b9f7)

> Find the parameter and object while examining the class named FlagstaffHill.
<br></br>
> ![4](https://github.com/boranakova/ctf/assets/56170942/ffbd9585-6722-420b-9e4c-83163eb2e1ec)
![5](https://github.com/boranakova/ctf/assets/56170942/7abacba7-0f67-4094-8aed-08e42b2eb2db)
![6](https://github.com/boranakova/ctf/assets/56170942/ca054e56-b1fc-4bb4-8845-050c2dd025bc)

> So If input equals to the value of password. Is simply gives us the flag ? ( If you stuck you must check the getFlag method again )




![7](https://github.com/boranakova/ctf/assets/56170942/2f7f120a-6bb6-4b00-aa50-c4b68fd77fb1)
