package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Properties;

/* renamed from: X.0Bb  reason: invalid class name */
/* loaded from: classes.dex */
public final class C0Bb {
    public static final C1C0 A00(Context context, C1C0 c1c0, boolean z) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Writing key to properties file");
        }
        Properties properties = new Properties();
        KeyPair keyPair = c1c0.A01;
        properties.setProperty("pub", Base64.encodeToString(keyPair.getPublic().getEncoded(), 11));
        properties.setProperty("pri", Base64.encodeToString(keyPair.getPrivate().getEncoded(), 11));
        properties.setProperty("cre", String.valueOf(c1c0.A00));
        File A04 = A04(context);
        try {
            A04.createNewFile();
            RandomAccessFile randomAccessFile = new RandomAccessFile(A04, "rw");
            FileChannel channel = randomAccessFile.getChannel();
            channel.lock();
            if (z && channel.size() > 0) {
                try {
                    channel.position(0L);
                    C1C0 A03 = A03(channel);
                    A07(null, channel);
                    randomAccessFile.close();
                    return A03;
                } catch (C1CS | IOException e) {
                    if (Log.isLoggable("FirebaseInstanceId", 3)) {
                        String valueOf = String.valueOf(e);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 64);
                        sb.append("Tried reading key pair before writing new one, but failed with: ");
                        sb.append(valueOf);
                        Log.d("FirebaseInstanceId", sb.toString());
                    }
                }
            }
            channel.position(0L);
            properties.store(Channels.newOutputStream(channel), (String) null);
            A07(null, channel);
            randomAccessFile.close();
            return c1c0;
        } catch (IOException e2) {
            String valueOf2 = String.valueOf(e2);
            StringBuilder sb2 = new StringBuilder(valueOf2.length() + 21);
            sb2.append("Failed to write key: ");
            sb2.append(valueOf2);
            Log.w("FirebaseInstanceId", sb2.toString());
            return null;
        }
    }

    public static C1C0 A01(SharedPreferences sharedPreferences) {
        long parseLong;
        String string = sharedPreferences.getString(C02400Ba.A00("|P|"), null);
        String string2 = sharedPreferences.getString(C02400Ba.A00("|K|"), null);
        if (string == null || string2 == null) {
            return null;
        }
        KeyPair A05 = A05(string, string2);
        String string3 = sharedPreferences.getString(C02400Ba.A00("cre"), null);
        if (string3 != null) {
            try {
                parseLong = Long.parseLong(string3);
            } catch (NumberFormatException unused) {
            }
            return new C1C0(A05, parseLong);
        }
        parseLong = 0;
        return new C1C0(A05, parseLong);
    }

    public static final C1C0 A02(File file) {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileChannel channel = fileInputStream.getChannel();
            channel.lock(0L, Long.MAX_VALUE, true);
            C1C0 A03 = A03(channel);
            A07(null, channel);
            fileInputStream.close();
            return A03;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    fileInputStream.close();
                    throw th2;
                } catch (Throwable th3) {
                    C234916x.A00.A00(th, th3);
                    throw th2;
                }
            }
        }
    }

    public static C1C0 A03(FileChannel fileChannel) {
        Properties properties = new Properties();
        properties.load(Channels.newInputStream(fileChannel));
        String property = properties.getProperty("pub");
        String property2 = properties.getProperty("pri");
        if (property != null && property2 != null) {
            try {
                return new C1C0(A05(property, property2), Long.parseLong(properties.getProperty("cre")));
            } catch (NumberFormatException e) {
                throw new C1CS(e);
            }
        }
        throw new C1CS();
    }

    public static File A04(Context context) {
        String obj;
        if (TextUtils.isEmpty("")) {
            obj = "com.google.InstanceId.properties";
        } else {
            try {
                String encodeToString = Base64.encodeToString("".getBytes("UTF-8"), 11);
                StringBuilder sb = new StringBuilder(String.valueOf(encodeToString).length() + 33);
                sb.append("com.google.InstanceId_");
                sb.append(encodeToString);
                sb.append(".properties");
                obj = sb.toString();
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
        File A04 = C02160Ac.A04(context);
        if (A04 == null || !A04.isDirectory()) {
            Log.w("FirebaseInstanceId", "noBackupFilesDir doesn't exist, using regular files directory instead");
            A04 = context.getFilesDir();
        }
        return new File(A04, obj);
    }

    public static KeyPair A05(String str, String str2) {
        try {
            byte[] decode = Base64.decode(str, 8);
            byte[] decode2 = Base64.decode(str2, 8);
            try {
                KeyFactory keyFactory = KeyFactory.getInstance("RSA");
                return new KeyPair(keyFactory.generatePublic(new X509EncodedKeySpec(decode)), keyFactory.generatePrivate(new PKCS8EncodedKeySpec(decode2)));
            } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(valueOf.length() + 19);
                sb.append("Invalid key stored ");
                sb.append(valueOf);
                Log.w("FirebaseInstanceId", sb.toString());
                throw new C1CS(e);
            }
        } catch (IllegalArgumentException e2) {
            throw new C1CS(e2);
        }
    }

    public static final void A06(Context context, C1C0 c1c0) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        try {
            if (c1c0.equals(A01(sharedPreferences))) {
                return;
            }
        } catch (C1CS unused) {
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Writing key to shared preferences");
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        String A00 = C02400Ba.A00("|P|");
        KeyPair keyPair = c1c0.A01;
        edit.putString(A00, Base64.encodeToString(keyPair.getPublic().getEncoded(), 11));
        edit.putString(C02400Ba.A00("|K|"), Base64.encodeToString(keyPair.getPrivate().getEncoded(), 11));
        edit.putString(C02400Ba.A00("cre"), String.valueOf(c1c0.A00));
        edit.commit();
    }

    public static void A07(Throwable th, FileChannel fileChannel) {
        if (th == null) {
            fileChannel.close();
            return;
        }
        try {
            fileChannel.close();
        } catch (Throwable th2) {
            C234916x.A00.A00(th, th2);
        }
    }

    public final C1C0 A08(Context context) {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
            keyPairGenerator.initialize(2048);
            C1C0 c1c0 = new C1C0(keyPairGenerator.generateKeyPair(), System.currentTimeMillis());
            C1C0 A00 = A00(context, c1c0, true);
            if (A00 != null && !A00.equals(c1c0)) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    Log.d("FirebaseInstanceId", "Loaded key after generating new one, using loaded one");
                }
                return A00;
            }
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "Generated new key");
            }
            A06(context, c1c0);
            return c1c0;
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }
}
