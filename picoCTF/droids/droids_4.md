# PicoCTF \ Reverse-Engineering \ droids-4 \ Write-Up

> You need to install Android Studio and the Emulator for this level. Also you need to reverse engineering tool for decoding the binary code of the .apk file.


When you setup the Android Studio properly Run the <b>.apk</b> file given by this level.
<br></br>

> We can see the FlagStaffHill class have a Cordamom() function which is not called yet while we were checking via jadx-gui.
> 
![1](https://github.com/boranakova/ctf/assets/56170942/41ad938a-3319-435f-a393-2245c70143fb)

> Also we need to solve this string equation like below.
> I copy-pasted into online Java compiler and found the string value of this equation.

![2](https://github.com/boranakova/ctf/assets/56170942/fc48ea62-c56d-448d-9faa-e4307d224ace)

Like previous level. We need to call this method with editing .smali file of FlagstaffHill.

> But first we need to do the same steps as we did droid-3
```sh
apktool d four.apk --no-res
```
> I used --no-res because decompiling with resources was causing errors.
> The editing the GetFlag() method will gave us a flag. Adding cordamom(input) into If statement.
> I checked the droid-3 smali file and learned from how to call method with .smali format.
```java
invoke-static {p0}, Lcom/hellocmu/picoctf/FlagstaffHill;->cardamom(Ljava/lang/String;)Ljava/lang/String; move-result-object v0 return-object v0
```
> While adding this code like above you need to remove <b> const-string v5, "call it" return-object v5 </b> part of a .smali file named FlagstaffHill.smali
<br></br>
```sh
apktool b four -o recompiled/recompiled_four.apk
```
> After building, The apk file and certificates of a file must be signed and verified. So using uber-apk-signer tool by patrickfav will solve this problem.
```sh
wget https://github.com/patrickfav/uber-apk-signer/releases/download/v1.3.0/uber-apk-signer-1.3.0.jar
java -jar uber-apk-signer-1.3.0.jar --apks recompiled
```
If command executed correctly. You can <b>recompiled_three-aligned-debugSigned.apk</b> file on the directory called <b>recompiled</b>.

Open Android Studio Emulator and install the .apk file then simply click the button you can see the flag like below.

![4](https://github.com/boranakova/ctf/assets/56170942/e710f9be-eb1c-4eae-a786-01476997ce19)

> DON'T FORGET TO WRITE ALPHABETSOUP.
