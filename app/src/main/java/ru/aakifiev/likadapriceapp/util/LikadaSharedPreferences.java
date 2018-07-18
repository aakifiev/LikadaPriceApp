package ru.likada.monitoringdriver.util;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.HashSet;
import java.util.Set;

public class SharedPreferencesManager {
    private SharedPreferences mPrefs;
    private SharedPreferences.Editor editor;
    private final String DEFAULT_IP_ADDRES = "http://192.168.1.38/rest/";
    private final String TOKEN = "token";
    private final String TO_SEND_FILES_LIST = "toSendFilesList";
    private final String DELIVERED_FILES_LIST = "deliveredFilesList";
    private final String LAST_LOGIN = "lastLogin";
    private final String LAST_PASSWORD = "lastPassword";
    private final String IP_CONFIG = "ipConfig";
    private final String IP_ADDRES = "ipAddres";
    private final String GCM_TOKEN = "gcmToken";
    private final String TITLE = "title";
    public static final String VEHICLE_ID = "vehicleId";
    public SharedPreferencesManager(Context context){
        mPrefs = context.getSharedPreferences("", context.MODE_PRIVATE);
        editor = mPrefs.edit();
    }
    public String findToken(){
        return mPrefs.getString(TOKEN, null);
    }
    public void putToken(String token){
        editor.putString(TOKEN, token);
        editor.commit();
    }
    public void deleteToken(){
        editor.remove(TOKEN);
        editor.commit();
    }
    public Set<String> findToSendFilesSet(){
        return mPrefs.getStringSet(TO_SEND_FILES_LIST, new HashSet<String>());
    }
    public void putFilesToSendSet(Set<String> set){
        editor.putStringSet(TO_SEND_FILES_LIST, set);
        editor.commit();
    }
    public String findLastLogin(){
        return mPrefs.getString(LAST_LOGIN, "");
    }
    public void putLastLogin(String login){
        editor.putString(LAST_LOGIN, login);
        editor.commit();
    }
    public String findLastPassword(){
        return mPrefs.getString(LAST_PASSWORD, "");
    }
    public void putLastPassword(String password){
        editor.putString(LAST_PASSWORD, password);
        editor.commit();
    }
    public int findIpConfig(){
        return mPrefs.getInt(IP_CONFIG, 1);
    }
    public void putIpConfig(int ipConfig){
        editor.putInt(IP_CONFIG, ipConfig);
        editor.commit();
    }
    public String findIpAddres(){
        return mPrefs.getString(IP_ADDRES, DEFAULT_IP_ADDRES);
    }
    public void putIpAddres(String ipAddres){
        editor.putString(IP_ADDRES, ipAddres);
        editor.commit();
    }
    public String findGcmToken(){
        return mPrefs.getString(GCM_TOKEN, null);
    }
    public void putGcmToken(String gcmToken){
        editor.putString(GCM_TOKEN, gcmToken);
        editor.commit();
    }
    public String findTitle(){
        return mPrefs.getString(TITLE, "");
    }
    public void putTitle(String title){
        editor.putString(TITLE, title);
        editor.commit();
    }
    public void putVehicleId(Long vehicleId){
        editor.putLong(VEHICLE_ID, vehicleId);
        editor.commit();
    }
    public Long getVehicleId(){
        return mPrefs.getLong(VEHICLE_ID, -1L);
    }
    public void deleteTitle(){
        editor.remove(TITLE);
        editor.apply();
    }
}
