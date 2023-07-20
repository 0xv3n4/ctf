# PicoCTF \ Reverse-Engineering \ droids-3 \ Write-Up

> You need to install Android Studio and the Emulator for this level. Also you need to reverse engineering tool for decoding the binary code of the .apk file.


When you setup the Android Studio properly Run the <b>.apk</b> file given by this level.
<br></br>

> We can see the FlagStaffHill class have a Yep() function which is not called yet while we were checking via jadx-gui.
![Screenshot_1](https://github.com/boranakova/ctf/assets/56170942/f35488ef-7de6-439c-8cc5-494bddb1cfa0)


We need to use <b>apktool</b> like previous levels. 

```sh
apktool d three.apk --no-res
```
> I used --no-res because decompiling with resources was causing errors.
> The editing the GetFlag() method will gave us a flag. Change from <b>nope</b> to <b>yep</b>

![3](https://github.com/boranakova/ctf/assets/56170942/a4ba9496-a358-4698-95e4-9a8d8dda3730)
```sh
apktool b four -o recompiled/recompiled_four.apk
```
> After editing and building, the apk file and certificates of a file must be signed and verified. So using uber-apk-signer tool by patrickfav will solve this problem.
```sh
wget https://github.com/patrickfav/uber-apk-signer/releases/download/v1.3.0/uber-apk-signer-1.3.0.jar
java -jar uber-apk-signer-1.3.0.jar --apks recompiled
```
If command executed correctly. You can <b>recompiled_three-aligned-debugSigned.apk</b> file on the directory called <b>recompiled</b>.

Open Android Studio Emulator and install the .apk file then simply click the button you can see the flag like below.

![6](https://github.com/boranakova/ctf/assets/56170942/731ca4b7-a242-476f-aea5-56198e5811f3)
