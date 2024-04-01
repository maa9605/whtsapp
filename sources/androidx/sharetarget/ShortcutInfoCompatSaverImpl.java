package androidx.sharetarget;

import X.AbstractC12870kD;
import X.C006702y;
import X.C0M2;
import X.C12810k6;
import X.C15810pN;
import X.C38381o3;
import X.CallableC15740pG;
import X.RunnableC15780pK;
import X.RunnableC15800pM;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import android.util.Xml;
import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes.dex */
public class ShortcutInfoCompatSaverImpl extends AbstractC12870kD {
    public static final Object A07 = new Object();
    public static volatile ShortcutInfoCompatSaverImpl A08;
    public final Context A00;
    public final File A01;
    public final File A02;
    public final ExecutorService A05;
    public final ExecutorService A06;
    public final Map A04 = new C006702y();
    public final Map A03 = new C006702y();

    public ShortcutInfoCompatSaverImpl(Context context, ExecutorService executorService, ExecutorService executorService2) {
        this.A00 = context.getApplicationContext();
        this.A05 = executorService;
        this.A06 = executorService2;
        final File file = new File(context.getFilesDir(), "ShortcutInfoCompatSaver_share_targets");
        this.A01 = new File(file, "ShortcutInfoCompatSaver_share_targets_bitmaps");
        this.A02 = new File(file, "targets.xml");
        this.A05.submit(new Runnable() { // from class: X.0pE
            {
                ShortcutInfoCompatSaverImpl.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    ShortcutInfoCompatSaverImpl.A00(file);
                    ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl = ShortcutInfoCompatSaverImpl.this;
                    ShortcutInfoCompatSaverImpl.A00(shortcutInfoCompatSaverImpl.A01);
                    Map map = shortcutInfoCompatSaverImpl.A04;
                    File file2 = shortcutInfoCompatSaverImpl.A02;
                    Context context2 = shortcutInfoCompatSaverImpl.A00;
                    C006702y c006702y = new C006702y();
                    try {
                        if (file2.exists()) {
                            FileInputStream fileInputStream = new FileInputStream(file2);
                            XmlPullParser newPullParser = Xml.newPullParser();
                            newPullParser.setInput(fileInputStream, "UTF_8");
                            while (true) {
                                int next = newPullParser.next();
                                if (next == 1) {
                                    break;
                                } else if (next == 2 && newPullParser.getName().equals("target")) {
                                    if (newPullParser.getName().equals("target")) {
                                        String A0Q = C07O.A0Q(newPullParser, "id");
                                        String A0Q2 = C07O.A0Q(newPullParser, "short_label");
                                        if (!TextUtils.isEmpty(A0Q) && !TextUtils.isEmpty(A0Q2)) {
                                            int parseInt = Integer.parseInt(C07O.A0Q(newPullParser, "rank"));
                                            String A0Q3 = C07O.A0Q(newPullParser, "long_label");
                                            String A0Q4 = C07O.A0Q(newPullParser, "disabled_message");
                                            String A0Q5 = C07O.A0Q(newPullParser, "component");
                                            ComponentName unflattenFromString = TextUtils.isEmpty(A0Q5) ? null : ComponentName.unflattenFromString(A0Q5);
                                            String A0Q6 = C07O.A0Q(newPullParser, "icon_resource_name");
                                            String A0Q7 = C07O.A0Q(newPullParser, "icon_bitmap_path");
                                            ArrayList arrayList = new ArrayList();
                                            HashSet hashSet = new HashSet();
                                            while (true) {
                                                int next2 = newPullParser.next();
                                                if (next2 != 1) {
                                                    if (next2 == 2) {
                                                        String name = newPullParser.getName();
                                                        int hashCode = name.hashCode();
                                                        if (hashCode != -1183762788) {
                                                            if (hashCode == 1296516636 && name.equals("categories")) {
                                                                String A0Q8 = C07O.A0Q(newPullParser, "name");
                                                                if (!TextUtils.isEmpty(A0Q8)) {
                                                                    hashSet.add(A0Q8);
                                                                }
                                                            }
                                                        } else if (name.equals("intent")) {
                                                            String A0Q9 = C07O.A0Q(newPullParser, "action");
                                                            String A0Q10 = C07O.A0Q(newPullParser, "targetPackage");
                                                            String A0Q11 = C07O.A0Q(newPullParser, "targetClass");
                                                            if (A0Q9 != null) {
                                                                Intent intent = new Intent(A0Q9);
                                                                if (!TextUtils.isEmpty(A0Q10) && !TextUtils.isEmpty(A0Q11)) {
                                                                    intent.setClassName(A0Q10, A0Q11);
                                                                }
                                                                arrayList.add(intent);
                                                            }
                                                        }
                                                    } else if (next2 == 3 && newPullParser.getName().equals("target")) {
                                                        break;
                                                    }
                                                } else {
                                                    break;
                                                }
                                            }
                                            C0M2 c0m2 = new C0M2();
                                            c0m2.A02 = context2;
                                            c0m2.A07 = A0Q;
                                            c0m2.A05 = A0Q2;
                                            c0m2.A00 = parseInt;
                                            if (!TextUtils.isEmpty(A0Q3)) {
                                                c0m2.A06 = A0Q3;
                                            }
                                            if (!TextUtils.isEmpty(A0Q4)) {
                                                c0m2.A04 = A0Q4;
                                            }
                                            if (unflattenFromString != null) {
                                                c0m2.A01 = unflattenFromString;
                                            }
                                            if (!arrayList.isEmpty()) {
                                                c0m2.A0B = (Intent[]) arrayList.toArray(new Intent[0]);
                                            }
                                            if (!hashSet.isEmpty()) {
                                                c0m2.A08 = hashSet;
                                            }
                                            if (!TextUtils.isEmpty(c0m2.A05)) {
                                                Intent[] intentArr = c0m2.A0B;
                                                if (intentArr == null || intentArr.length == 0) {
                                                    break;
                                                }
                                                C15810pN c15810pN = new C15810pN(c0m2, A0Q6, A0Q7);
                                                C0M2 c0m22 = c15810pN.A00;
                                                if (c0m22 != null) {
                                                    c006702y.put(c0m22.A07, c15810pN);
                                                }
                                            } else {
                                                throw new IllegalArgumentException("Shortcut must have a non-empty label");
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                            throw new IllegalArgumentException("Shortcut must have an intent");
                        }
                    } catch (Exception e) {
                        file2.delete();
                        StringBuilder sb = new StringBuilder("Failed to load saved values from file ");
                        sb.append(file2.getAbsolutePath());
                        sb.append(". Old state removed, new added");
                        Log.e("ShortcutInfoCompatSaver", sb.toString(), e);
                    }
                    map.putAll(c006702y);
                    shortcutInfoCompatSaverImpl.A05(new ArrayList(map.values()));
                } catch (Exception e2) {
                    Log.w("ShortcutInfoCompatSaver", "ShortcutInfoCompatSaver started with an exceptions ", e2);
                }
            }
        });
    }

    public static void A00(File file) {
        if ((!file.exists() || file.isDirectory() || file.delete()) && !file.exists()) {
            file.mkdirs();
        }
    }

    @Override // X.AbstractC12870kD
    public Object A01() {
        final C38381o3 c38381o3 = new C38381o3();
        this.A05.submit(new Runnable() { // from class: X.0pF
            {
                ShortcutInfoCompatSaverImpl.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl = ShortcutInfoCompatSaverImpl.this;
                shortcutInfoCompatSaverImpl.A04.clear();
                Map map = shortcutInfoCompatSaverImpl.A03;
                for (Future future : map.values()) {
                    future.cancel(false);
                }
                map.clear();
                shortcutInfoCompatSaverImpl.A04(c38381o3);
            }
        });
        return c38381o3;
    }

    @Override // X.AbstractC12870kD
    public Object A02(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0M2 c0m2 = (C0M2) it.next();
            C0M2 c0m22 = new C0M2();
            c0m22.A02 = c0m2.A02;
            c0m22.A07 = c0m2.A07;
            Intent[] intentArr = c0m2.A0B;
            c0m22.A0B = (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
            c0m22.A01 = c0m2.A01;
            c0m22.A05 = c0m2.A05;
            c0m22.A06 = c0m2.A06;
            c0m22.A04 = c0m2.A04;
            c0m22.A03 = c0m2.A03;
            c0m22.A09 = c0m2.A09;
            c0m22.A0A = c0m2.A0A;
            c0m22.A00 = c0m2.A00;
            C12810k6[] c12810k6Arr = c0m2.A0C;
            if (c12810k6Arr != null) {
                c0m22.A0C = (C12810k6[]) Arrays.copyOf(c12810k6Arr, c12810k6Arr.length);
            }
            Set set = c0m2.A08;
            if (set != null) {
                c0m22.A08 = new HashSet(set);
            }
            if (!TextUtils.isEmpty(c0m22.A05)) {
                Intent[] intentArr2 = c0m22.A0B;
                if (intentArr2 != null && intentArr2.length != 0) {
                    arrayList.add(c0m22);
                } else {
                    throw new IllegalArgumentException("Shortcut must have an intent");
                }
            } else {
                throw new IllegalArgumentException("Shortcut must have a non-empty label");
            }
        }
        C38381o3 c38381o3 = new C38381o3();
        this.A05.submit(new RunnableC15780pK(this, arrayList, c38381o3));
        return c38381o3;
    }

    @Override // X.AbstractC12870kD
    public List A03() {
        return (List) this.A05.submit(new CallableC15740pG(this)).get();
    }

    public void A04(final C38381o3 c38381o3) {
        final ArrayList arrayList = new ArrayList(this.A04.values());
        Runnable runnable = new Runnable() { // from class: X.0pC
            {
                ShortcutInfoCompatSaverImpl.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                FileOutputStream fileOutputStream;
                Intent[] intentArr;
                ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl = ShortcutInfoCompatSaverImpl.this;
                List<C15810pN> list = arrayList;
                shortcutInfoCompatSaverImpl.A05(list);
                C13010kS c13010kS = new C13010kS(shortcutInfoCompatSaverImpl.A02);
                FileOutputStream fileOutputStream2 = null;
                try {
                    File file = c13010kS.A01;
                    if (file.exists()) {
                        File file2 = c13010kS.A00;
                        if (!file2.exists()) {
                            if (!file.renameTo(file2)) {
                                StringBuilder A0P = C000200d.A0P("Couldn't rename file ");
                                A0P.append(file);
                                A0P.append(" to backup file ");
                                A0P.append(file2);
                                Log.w("AtomicFile", A0P.toString());
                            }
                        } else {
                            file.delete();
                        }
                    }
                    try {
                        fileOutputStream = new FileOutputStream(file);
                    } catch (FileNotFoundException unused) {
                        if (file.getParentFile().mkdirs()) {
                            try {
                                fileOutputStream = new FileOutputStream(file);
                            } catch (FileNotFoundException unused2) {
                                StringBuilder A0P2 = C000200d.A0P("Couldn't create ");
                                A0P2.append(file);
                                throw new IOException(A0P2.toString());
                            }
                        } else {
                            StringBuilder A0P3 = C000200d.A0P("Couldn't create directory ");
                            A0P3.append(file);
                            throw new IOException(A0P3.toString());
                        }
                    }
                    try {
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
                        XmlSerializer newSerializer = Xml.newSerializer();
                        newSerializer.setOutput(bufferedOutputStream, "UTF_8");
                        newSerializer.startDocument(null, Boolean.TRUE);
                        newSerializer.startTag(null, "share_targets");
                        for (C15810pN c15810pN : list) {
                            newSerializer.startTag(null, "target");
                            C0M2 c0m2 = c15810pN.A00;
                            C07O.A0x(newSerializer, "id", c0m2.A07);
                            C07O.A0x(newSerializer, "short_label", c0m2.A05.toString());
                            C07O.A0x(newSerializer, "rank", Integer.toString(c0m2.A00));
                            if (!TextUtils.isEmpty(c0m2.A06)) {
                                C07O.A0x(newSerializer, "long_label", c0m2.A06.toString());
                            }
                            if (!TextUtils.isEmpty(c0m2.A04)) {
                                C07O.A0x(newSerializer, "disabled_message", c0m2.A04.toString());
                            }
                            ComponentName componentName = c0m2.A01;
                            if (componentName != null) {
                                C07O.A0x(newSerializer, "component", componentName.flattenToString());
                            }
                            String str = c15810pN.A02;
                            if (!TextUtils.isEmpty(str)) {
                                C07O.A0x(newSerializer, "icon_resource_name", str);
                            }
                            String str2 = c15810pN.A01;
                            if (!TextUtils.isEmpty(str2)) {
                                C07O.A0x(newSerializer, "icon_bitmap_path", str2);
                            }
                            Intent[] intentArr2 = c0m2.A0B;
                            for (Intent intent : (Intent[]) Arrays.copyOf(intentArr2, intentArr2.length)) {
                                newSerializer.startTag(null, "intent");
                                C07O.A0x(newSerializer, "action", intent.getAction());
                                if (intent.getComponent() != null) {
                                    C07O.A0x(newSerializer, "targetPackage", intent.getComponent().getPackageName());
                                    C07O.A0x(newSerializer, "targetClass", intent.getComponent().getClassName());
                                }
                                newSerializer.endTag(null, "intent");
                            }
                            for (String str3 : c0m2.A08) {
                                if (!TextUtils.isEmpty(str3)) {
                                    newSerializer.startTag(null, "categories");
                                    C07O.A0x(newSerializer, "name", str3);
                                    newSerializer.endTag(null, "categories");
                                }
                            }
                            newSerializer.endTag(null, "target");
                        }
                        newSerializer.endTag(null, "share_targets");
                        newSerializer.endDocument();
                        bufferedOutputStream.flush();
                        fileOutputStream.flush();
                        try {
                            fileOutputStream.getFD().sync();
                        } catch (IOException unused3) {
                        }
                        try {
                            fileOutputStream.close();
                            c13010kS.A00.delete();
                        } catch (IOException e) {
                            Log.w("AtomicFile", "finishWrite: Got exception:", e);
                        }
                    } catch (Exception e2) {
                        e = e2;
                        fileOutputStream2 = fileOutputStream;
                        StringBuilder A0P4 = C000200d.A0P("Failed to write to file ");
                        File file3 = c13010kS.A01;
                        A0P4.append(file3);
                        Log.e("ShortcutInfoCompatSaver", A0P4.toString(), e);
                        if (fileOutputStream2 != null) {
                            try {
                                fileOutputStream2.getFD().sync();
                            } catch (IOException unused4) {
                            }
                            try {
                                fileOutputStream2.close();
                                file3.delete();
                                c13010kS.A00.renameTo(file3);
                            } catch (IOException e3) {
                                Log.w("AtomicFile", "failWrite: Got exception:", e3);
                            }
                        }
                        StringBuilder A0P5 = C000200d.A0P("Failed to write to file ");
                        A0P5.append(file3);
                        throw new RuntimeException(A0P5.toString(), e);
                    }
                } catch (Exception e4) {
                    e = e4;
                }
            }
        };
        final C38381o3 c38381o32 = new C38381o3();
        this.A06.submit(new RunnableC15800pM(c38381o32, runnable));
        c38381o32.A5E(new Runnable() { // from class: X.0pD
            @Override // java.lang.Runnable
            public void run() {
                try {
                    c38381o32.get();
                    c38381o3.A07(null);
                } catch (Exception e) {
                    c38381o3.A06(e);
                }
            }
        }, this.A05);
    }

    public void A05(List list) {
        File[] listFiles;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = ((C15810pN) it.next()).A01;
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        for (File file : this.A01.listFiles()) {
            if (!arrayList.contains(file.getAbsolutePath())) {
                file.delete();
            }
        }
    }
}
