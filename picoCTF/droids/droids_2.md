# PicoCTF \ Reverse-Engineering \ droids-2 \ Write-Up

> You need to install Android Studio and the Emulator for this level. Also you need to reverse engineering tool for decoding the binary code of the .apk file.

When you setup the Android Studio properly Run the <b>.apk</b> file given by this level. 
<br></br>

> Like previous level , use apktool for decode the .apk file then simply use a jadx-gui panel or online apk decompiler for checking the methods , params or classes of an App

 ![3](https://github.com/boranakova/ctf/assets/56170942/e62bde77-d6c3-4286-88f6-7a5d51d3537e)

> Modifying the code such as removing the If query in the FlagstaffHill class and using it with <b>return</b> will give us a Flag.
> Or you can just placing the indexes of an array then use it as input like below.


![4](https://github.com/boranakova/ctf/assets/56170942/dbc4b243-dece-4ed4-bcd8-bdcd46d1443c)
![5](https://github.com/boranakova/ctf/assets/56170942/ecf3b52f-f0e0-4549-bcdc-d252f3b764fb)
