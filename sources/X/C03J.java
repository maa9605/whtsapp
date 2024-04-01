package X;

import android.app.Application;
import android.util.Base64;
import com.whatsapp.net.tls13.WtCachedPsk;
import com.whatsapp.util.Log;
import com.whatsapp.watls13.WtPersistentSession;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateFactory;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.03J  reason: invalid class name */
/* loaded from: classes.dex */
public class C03J {
    public static volatile C03J A03;
    public File A00;
    public final C001200o A01;
    public final C003701t A02;

    public C03J(C003701t c003701t, C001200o c001200o) {
        this.A02 = c003701t;
        this.A01 = c001200o;
    }

    /* JADX WARN: Finally extract failed */
    public static final WtPersistentSession A00(File file) {
        LinkedHashSet linkedHashSet;
        ByteArrayInputStream byteArrayInputStream;
        JSONObject jSONObject = new JSONObject(new String(AnonymousClass024.A0n(file)));
        String string = jSONObject.getString("sni");
        int i = jSONObject.getInt("port");
        String string2 = jSONObject.getString("cipher");
        JSONArray optJSONArray = jSONObject.optJSONArray("psks");
        if (optJSONArray != null) {
            linkedHashSet = new LinkedHashSet();
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                byteArrayInputStream = new ByteArrayInputStream(Base64.decode(optJSONArray.getString(i2), 0));
                try {
                    ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    WtCachedPsk wtCachedPsk = (WtCachedPsk) objectInputStream.readObject();
                    objectInputStream.close();
                    byteArrayInputStream.close();
                    linkedHashSet.add(wtCachedPsk);
                } finally {
                }
            }
        } else {
            linkedHashSet = null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("certs");
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Byte valueOf = Byte.valueOf(next);
            JSONArray jSONArray = jSONObject2.getJSONArray(next);
            Certificate[] certificateArr = new Certificate[jSONArray.length()];
            for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i3);
                String string3 = jSONObject3.getString("type");
                byte[] decode = Base64.decode(jSONObject3.getString("data"), 0);
                CertificateFactory certificateFactory = (CertificateFactory) hashMap.get(string3);
                if (certificateFactory == null) {
                    certificateFactory = CertificateFactory.getInstance(string3);
                    hashMap.put(string3, certificateFactory);
                }
                byteArrayInputStream = new ByteArrayInputStream(decode);
                try {
                    certificateArr[i3] = certificateFactory.generateCertificate(byteArrayInputStream);
                    byteArrayInputStream.close();
                } finally {
                    try {
                        throw th;
                    } catch (Throwable th) {
                        try {
                            byteArrayInputStream.close();
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
            hashMap2.put(valueOf, certificateArr);
        }
        return new WtPersistentSession(string, i, string2, linkedHashSet, hashMap2);
    }

    public static final WtPersistentSession A01(File file) {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            WtPersistentSession wtPersistentSession = (WtPersistentSession) objectInputStream.readObject();
            objectInputStream.close();
            return wtPersistentSession;
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                try {
                    fileInputStream.close();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static C03J A02() {
        if (A03 == null) {
            synchronized (C03J.class) {
                if (A03 == null) {
                    A03 = new C03J(C003701t.A00(), C001200o.A01);
                }
            }
        }
        return A03;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v13, types: [com.whatsapp.watls13.WtPersistentSession] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v9, types: [com.whatsapp.watls13.WtPersistentSession] */
    public final WtPersistentSession A03(File file) {
        if (file == null || !file.exists()) {
            return null;
        }
        try {
            if (this.A02.A0C(505)) {
                try {
                    return A00(file);
                } catch (Exception e) {
                    e = e;
                    try {
                        e = A01(file);
                        return e;
                    } catch (Exception unused) {
                        throw e;
                    }
                }
            }
            try {
                return A01(file);
            } catch (Exception e2) {
                e = e2;
                try {
                    e = A00(file);
                    return e;
                } catch (Exception unused2) {
                    throw e;
                }
            }
        } catch (Exception e3) {
            Log.w("WtPersistentSessionCacheImpl/readSession: unable to deserialize persisted session", e3);
            return null;
        }
        Log.w("WtPersistentSessionCacheImpl/readSession: unable to deserialize persisted session", e3);
        return null;
    }

    public final File A04() {
        synchronized (this) {
            File file = this.A00;
            if (file != null) {
                return file;
            }
            Application application = this.A01.A00;
            if (application == null) {
                return null;
            }
            File file2 = new File(application.getCacheDir(), "watls-sessions");
            this.A00 = file2;
            if (!file2.exists() && !this.A00.mkdir()) {
                this.A00 = null;
                return null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("WtPersistentSessionCacheImpl/getCacheDir: using external persistent cache directory ");
            sb.append(this.A00.getAbsolutePath());
            Log.i(sb.toString());
            return this.A00;
        }
    }

    public synchronized void A05(byte[] bArr) {
        if (A04() == null) {
            return;
        }
        File file = new File(A04(), Base64.encodeToString(bArr, 10));
        if (!file.delete()) {
            StringBuilder sb = new StringBuilder();
            sb.append("WtPersistentSessionCacheImpl/removeSession: Error during remove session ");
            sb.append(file.getAbsolutePath());
            Log.e(sb.toString());
        }
    }

    /* JADX WARN: Finally extract failed */
    public synchronized void A06(byte[] bArr, Object obj) {
        JSONArray jSONArray;
        Certificate[] certificateArr;
        if (A04() == null) {
            return;
        }
        File file = new File(A04(), Base64.encodeToString(bArr, 10));
        try {
            if (this.A02.A0C(505)) {
                WtPersistentSession wtPersistentSession = (WtPersistentSession) obj;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("sni", wtPersistentSession.sni);
                    jSONObject.put("port", wtPersistentSession.port);
                    jSONObject.put("cipher", wtPersistentSession.cipher);
                    LinkedHashSet linkedHashSet = wtPersistentSession.psks;
                    if (linkedHashSet != null) {
                        jSONArray = new JSONArray();
                        Iterator it = linkedHashSet.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            try {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                                    objectOutputStream.writeObject(next);
                                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                                    objectOutputStream.close();
                                    jSONArray.put(Base64.encodeToString(byteArray, 2));
                                } finally {
                                }
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    } else {
                        jSONArray = null;
                    }
                    jSONObject.put("psks", jSONArray);
                    Map map = wtPersistentSession.certs;
                    JSONObject jSONObject2 = new JSONObject();
                    for (Map.Entry entry : map.entrySet()) {
                        JSONArray jSONArray2 = new JSONArray();
                        for (Certificate certificate : (Certificate[]) entry.getValue()) {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("type", certificate.getType());
                            try {
                                jSONObject3.put("data", Base64.encodeToString(certificate.getEncoded(), 2));
                                jSONArray2.put(jSONObject3);
                            } catch (CertificateEncodingException e2) {
                                throw new RuntimeException(e2);
                            }
                        }
                        jSONObject2.put(String.valueOf(entry.getKey()), jSONArray2);
                    }
                    jSONObject.put("certs", jSONObject2);
                    AnonymousClass024.A0b(jSONObject.toString().getBytes(), file);
                } catch (JSONException e3) {
                    throw new RuntimeException(e3);
                }
            } else {
                WtPersistentSession wtPersistentSession2 = (WtPersistentSession) obj;
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(fileOutputStream);
                    objectOutputStream2.writeObject(wtPersistentSession2);
                    objectOutputStream2.close();
                    fileOutputStream.close();
                } finally {
                }
            }
        } catch (Exception e4) {
            StringBuilder sb = new StringBuilder();
            sb.append("WtPersistentSessionCacheImpl/putSession: Error during put session ");
            sb.append(file.getAbsolutePath());
            sb.append(" : ");
            sb.append(e4);
            Log.e(sb.toString());
        }
    }
}
