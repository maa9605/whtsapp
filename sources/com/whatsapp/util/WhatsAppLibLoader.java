package com.whatsapp.util;

import X.AbstractC000600i;
import X.AnonymousClass018;
import X.AnonymousClass024;
import X.C000200d;
import X.C000400f;
import X.C000500h;
import X.C001900w;
import android.content.Context;
import com.whatsapp.voipcalling.Voip;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes.dex */
public class WhatsAppLibLoader {
    public static volatile WhatsAppLibLoader A09;
    public Boolean A00 = null;
    public Map A01 = null;
    public final AbstractC000600i A02;
    public final C000400f A03;
    public final AnonymousClass018 A04;
    public final C000500h A05;
    public final C001900w A06;
    public static final String[] A08 = {"vlc", "whatsapp", "curve25519"};
    public static final String[] A07 = new String[0];

    public static native String getJNICodeVersion();

    public static native void testLibraryUsable(byte[] bArr);

    public WhatsAppLibLoader(AbstractC000600i abstractC000600i, C000400f c000400f, C000500h c000500h, C001900w c001900w, AnonymousClass018 anonymousClass018) {
        this.A02 = abstractC000600i;
        this.A03 = c000400f;
        this.A05 = c000500h;
        this.A06 = c001900w;
        this.A04 = anonymousClass018;
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [X.018] */
    public static WhatsAppLibLoader A00() {
        if (A09 == null) {
            synchronized (WhatsAppLibLoader.class) {
                if (A09 == null) {
                    A09 = new WhatsAppLibLoader(AbstractC000600i.A00(), C000400f.A00(), C000500h.A00(), C001900w.A00(), new Object() { // from class: X.018
                    });
                }
            }
        }
        return A09;
    }

    public static final boolean A01() {
        byte[] bArr = new byte[3];
        try {
            testLibraryUsable(bArr);
            if (!Arrays.equals(new byte[]{31, 41, 59}, bArr)) {
                Log.w("whatsapplibloader/usable test array does not match");
                return false;
            }
            try {
                String jNICodeVersion = getJNICodeVersion();
                StringBuilder sb = new StringBuilder();
                sb.append("whatsapplibloader/usable jniVersion: ");
                sb.append(jNICodeVersion);
                Log.i(sb.toString());
                if (!"2.21.9.15".equals(jNICodeVersion)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("whatsapplibloader/usable version does not match. JAVA version: ");
                    sb2.append("2.21.9.15");
                    sb2.append(", JNI version: ");
                    sb2.append(jNICodeVersion);
                    Log.w(sb2.toString());
                    return false;
                }
                try {
                    Voip.getCallInfo();
                    Log.i("whatsapplibloader/usable isLibraryUsable: True");
                    return true;
                } catch (UnsatisfiedLinkError e) {
                    Log.w("whatsapplibloader/usable error while testing library usability getCallInfo", e);
                    return false;
                }
            } catch (UnsatisfiedLinkError e2) {
                Log.w("whatsapplibloader/usable error while testing library usability getJNICodeVersion", e2);
                return false;
            }
        } catch (UnsatisfiedLinkError e3) {
            Log.w("whatsapplibloader/usable error while testing library usability testLibraryUsable", e3);
            return false;
        }
    }

    public final void A02(Context context, String str) {
        C000200d.A14("whatsapplibloader/system-load-library-with-install start, loading: ", str);
        try {
        } catch (UnsatisfiedLinkError e) {
            Log.w("whatsapplibloader/system-load-library-with-install error", e);
            A03(context, Arrays.asList(str));
        }
        if (this.A04 == null) {
            throw null;
        }
        System.loadLibrary(str);
        Log.i("whatsapplibloader/system-load-library-with-install end");
    }

    public synchronized void A03(Context context, List list) {
        StringBuilder sb = new StringBuilder();
        sb.append("whatsapplibloader/try-install start, loading: ");
        sb.append(list.size());
        Log.i(sb.toString());
        String A0A = AnonymousClass024.A0A();
        String str = "x86";
        if (A0A.startsWith("armeabi-v7")) {
            str = "armeabi-v7a";
        } else if (A0A.startsWith("arm64-v8a")) {
            str = "arm64-v8a";
        } else if (A0A.startsWith("x86_64")) {
            str = "x86_64";
        } else if (!A0A.startsWith("x86")) {
            throw new UnsatisfiedLinkError(C000200d.A0H("can not find lib folder for ABI ", A0A));
        }
        C000200d.A14("whatsapplibloader/arch resolved to ", str);
        try {
            ZipFile zipFile = new ZipFile(context.getPackageCodePath());
            try {
                if (this.A01 == null) {
                    HashMap hashMap = new HashMap(8);
                    String A0I = C000200d.A0I("lib/", str, "/lib");
                    byte[] bArr = new byte[8192];
                    Enumeration<? extends ZipEntry> entries = zipFile.entries();
                    while (entries.hasMoreElements()) {
                        ZipEntry nextElement = entries.nextElement();
                        String name = nextElement.getName();
                        if (name.endsWith(".so")) {
                            StringBuilder sb2 = new StringBuilder("whatsapplibloader/extractLibs found ");
                            sb2.append(name);
                            Log.i(sb2.toString());
                            if (name.startsWith(A0I)) {
                                String[] split = name.split("/");
                                String str2 = split[split.length - 1];
                                File file = new File(context.getFilesDir(), str2);
                                InputStream inputStream = zipFile.getInputStream(nextElement);
                                FileOutputStream fileOutputStream = new FileOutputStream(file);
                                while (true) {
                                    try {
                                        int read = inputStream.read(bArr);
                                        if (read <= 0) {
                                            break;
                                        }
                                        fileOutputStream.write(bArr, 0, read);
                                    } finally {
                                    }
                                }
                                fileOutputStream.close();
                                inputStream.close();
                                StringBuilder sb3 = new StringBuilder("whatsapplibloader/extractLibs copied ");
                                sb3.append(file.getAbsolutePath());
                                sb3.append(" from apk");
                                Log.i(sb3.toString());
                                hashMap.put(str2.substring(3, str2.length() - 3), file);
                            } else {
                                continue;
                            }
                        }
                    }
                    this.A01 = hashMap;
                } else {
                    Log.i("whatsapplibloader/try-install No need to extract libs again");
                }
                Map map = this.A01;
                ArrayList arrayList = new ArrayList(list);
                for (Object obj : map.keySet()) {
                    arrayList.remove(obj);
                }
                if (arrayList.isEmpty()) {
                    Map map2 = this.A01;
                    LinkedList linkedList = new LinkedList();
                    for (Object obj2 : list) {
                        linkedList.add(map2.get(obj2));
                    }
                    StringBuilder sb4 = new StringBuilder("whatsapplibloader/get-ordered-file-paths libs will be loaded as: ");
                    sb4.append(linkedList);
                    sb4.toString();
                    Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        String absolutePath = ((File) it.next()).getAbsolutePath();
                        if (this.A04 != null) {
                            System.load(absolutePath);
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("whatsapplibloader/try-install loaded: ");
                            sb5.append(absolutePath);
                            Log.i(sb5.toString());
                        } else {
                            throw null;
                        }
                    }
                    zipFile.close();
                } else {
                    StringBuilder A0P = C000200d.A0P("Libraries not found: ");
                    A0P.append(arrayList.toString());
                    throw new UnsatisfiedLinkError(A0P.toString());
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        zipFile.close();
                    } catch (Throwable unused) {
                    }
                    throw th2;
                }
            }
        } catch (IOException e) {
            Log.e("whatsapplibloader/try-install ioerror", e);
            throw new UnsatisfiedLinkError("IOException when install native library");
        }
    }

    public synchronized boolean A04() {
        if (this.A00 == null) {
            Log.e("whatsapplibloader/is-loaded: isLoaded() was called before load was attempted");
        }
        return this.A00 == Boolean.TRUE;
    }
}
