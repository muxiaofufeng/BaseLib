1、添加权限
<uses-permission android:name="android.permission.GET_TASKS" />
 <uses-permission android:name="android.permission.INTERNET" />
 <uses-permission android:name="android.permission.ACCESS_WIFI_STATE" />
 <uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />
 <uses-permission android:name="android.permission.CHANGE_WIFI_STATE" />
 <uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE" />
 <uses-permission android:name="android.permission.READ_PHONE_STATE" />
 <uses-permission android:name="android.permission.MANAGE_ACCOUNTS"/>
 <uses-permission android:name="android.permission.GET_ACCOUNTS"/>
 <!-- 蓝牙分享所需的权限 -->
  <uses-permission android:name="android.permission.BLUETOOTH" />
  <uses-permission android:name="android.permission.BLUETOOTH_ADMIN" />


2、添加activity信息
（注意： tencent后面的appid要保持和您配置的QQ的appid一致）

<activity
     android:name="com.mob.tools.MobUIShell"
     android:theme="@android:style/Theme.Translucent.NoTitleBar"
     android:configChanges="keyboardHidden|orientation|screenSize"
     android:screenOrientation="portrait"
     android:windowSoftInputMode="stateHidden|adjustResize" >

     <intent-filter>
         <data android:scheme="tencent100371282" />
         <action android:name="android.intent.action.VIEW" />
         <category android:name="android.intent.category.BROWSABLE" />
         <category android:name="android.intent.category.DEFAULT" />
     </intent-filter>

    <!-- 调用新浪原生SDK，需要注册的回调activity -->
    <intent-filter>
        <action android:name="com.sina.weibo.sdk.action.ACTION_SDK_REQ_ACTIVITY" />
        <category android:name="android.intent.category.DEFAULT" />
    </intent-filter>
 </activity>



 <!--微信分享回调 -->
  <activity
      android:name=".wxapi.WXEntryActivity"
      android:theme="@android:style/Theme.Translucent.NoTitleBar"
      android:configChanges="keyboardHidden|orientation|screenSize"
      android:exported="true"
      android:screenOrientation="portrait" />

 <!--易信分享回调 -->
  <activity
      android:name=".yxapi.YXEntryActivity"
      android:theme="@android:style/Theme.Translucent.NoTitleBar"
      android:configChanges="keyboardHidden|orientation|screenSize"
      android:exported="true"
      android:screenOrientation="portrait" />

  <!-- 支付宝分享回调 -->
 <activity
     android:name=".apshare.ShareEntryActivity"
     android:theme="@android:style/Theme.Translucent.NoTitleBar"
     android:configChanges="keyboardHidden|orientation|screenSize"
     android:exported="true"/>