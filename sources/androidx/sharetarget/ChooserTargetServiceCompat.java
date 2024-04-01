package androidx.sharetarget;

import X.C000200d;
import X.C0M2;
import X.C15660p7;
import X.C15670p9;
import X.C15680pA;
import X.C15690pB;
import X.C15810pN;
import X.CallableC15740pG;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.service.chooser.ChooserTarget;
import android.service.chooser.ChooserTargetService;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class ChooserTargetServiceCompat extends ChooserTargetService {
    @Override // android.service.chooser.ChooserTargetService
    public List onGetChooserTargets(ComponentName componentName, IntentFilter intentFilter) {
        IconCompat iconCompat;
        Bitmap bitmap;
        int identifier;
        Context applicationContext = getApplicationContext();
        if (C15690pB.A00 == null) {
            synchronized (C15690pB.A01) {
                if (C15690pB.A00 == null) {
                    ArrayList arrayList = new ArrayList();
                    Intent intent = new Intent("android.intent.action.MAIN");
                    intent.addCategory("android.intent.category.LAUNCHER");
                    intent.setPackage(applicationContext.getPackageName());
                    List<ResolveInfo> queryIntentActivities = applicationContext.getPackageManager().queryIntentActivities(intent, 128);
                    if (queryIntentActivities != null) {
                        for (ResolveInfo resolveInfo : queryIntentActivities) {
                            ActivityInfo activityInfo = resolveInfo.activityInfo;
                            Bundle bundle = activityInfo.metaData;
                            if (bundle != null && bundle.containsKey("android.app.shortcuts")) {
                                ArrayList arrayList2 = new ArrayList();
                                XmlResourceParser loadXmlMetaData = activityInfo.loadXmlMetaData(applicationContext.getPackageManager(), "android.app.shortcuts");
                                if (loadXmlMetaData == null) {
                                    StringBuilder A0P = C000200d.A0P("Failed to open android.app.shortcuts meta-data resource of ");
                                    A0P.append(activityInfo.name);
                                    throw new IllegalArgumentException(A0P.toString());
                                }
                                while (true) {
                                    try {
                                        int next = loadXmlMetaData.next();
                                        if (next == 1) {
                                            break;
                                        } else if (next == 2 && loadXmlMetaData.getName().equals("share-target")) {
                                            String A00 = C15690pB.A00(loadXmlMetaData, "targetClass");
                                            ArrayList arrayList3 = new ArrayList();
                                            ArrayList arrayList4 = new ArrayList();
                                            while (true) {
                                                int next2 = loadXmlMetaData.next();
                                                if (next2 == 1) {
                                                    break;
                                                } else if (next2 == 2) {
                                                    String name = loadXmlMetaData.getName();
                                                    char c = 65535;
                                                    int hashCode = name.hashCode();
                                                    if (hashCode != 3076010) {
                                                        if (hashCode == 50511102 && name.equals("category")) {
                                                            c = 1;
                                                        }
                                                    } else if (name.equals("data")) {
                                                        c = 0;
                                                    }
                                                    if (c == 0) {
                                                        C15690pB.A00(loadXmlMetaData, "scheme");
                                                        C15690pB.A00(loadXmlMetaData, "host");
                                                        C15690pB.A00(loadXmlMetaData, "port");
                                                        C15690pB.A00(loadXmlMetaData, "path");
                                                        C15690pB.A00(loadXmlMetaData, "pathPattern");
                                                        C15690pB.A00(loadXmlMetaData, "pathPrefix");
                                                        arrayList3.add(new C15670p9(C15690pB.A00(loadXmlMetaData, "mimeType")));
                                                    } else if (c == 1) {
                                                        arrayList4.add(C15690pB.A00(loadXmlMetaData, "name"));
                                                    }
                                                } else if (next2 == 3 && loadXmlMetaData.getName().equals("share-target")) {
                                                    break;
                                                }
                                            }
                                            C15680pA c15680pA = (arrayList3.isEmpty() || A00 == null || arrayList4.isEmpty()) ? null : new C15680pA((C15670p9[]) arrayList3.toArray(new C15670p9[arrayList3.size()]), A00, (String[]) arrayList4.toArray(new String[arrayList4.size()]));
                                            if (c15680pA != null) {
                                                arrayList2.add(c15680pA);
                                            }
                                        }
                                    } catch (Exception e) {
                                        Log.e("ShareTargetXmlParser", "Failed to parse the Xml resource: ", e);
                                    }
                                }
                                loadXmlMetaData.close();
                                arrayList.addAll(arrayList2);
                            }
                        }
                    }
                    C15690pB.A00 = arrayList;
                }
            }
        }
        ArrayList arrayList5 = C15690pB.A00;
        ArrayList arrayList6 = new ArrayList();
        Iterator it = arrayList5.iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                break;
            }
            C15680pA c15680pA2 = (C15680pA) it.next();
            if (c15680pA2.A00.equals(componentName.getClassName())) {
                C15670p9[] c15670p9Arr = c15680pA2.A01;
                int length = c15670p9Arr.length;
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (intentFilter.hasDataType(c15670p9Arr[i].A00)) {
                        arrayList6.add(c15680pA2);
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        if (arrayList6.isEmpty()) {
            return Collections.emptyList();
        }
        if (ShortcutInfoCompatSaverImpl.A08 == null) {
            synchronized (ShortcutInfoCompatSaverImpl.A07) {
                if (ShortcutInfoCompatSaverImpl.A08 == null) {
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    ShortcutInfoCompatSaverImpl.A08 = new ShortcutInfoCompatSaverImpl(applicationContext, new ThreadPoolExecutor(0, 1, 20L, timeUnit, new LinkedBlockingQueue()), new ThreadPoolExecutor(0, 1, 20L, timeUnit, new LinkedBlockingQueue()));
                }
            }
        }
        final ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl = ShortcutInfoCompatSaverImpl.A08;
        try {
            ExecutorService executorService = shortcutInfoCompatSaverImpl.A05;
            List<C0M2> list = (List) executorService.submit(new CallableC15740pG(shortcutInfoCompatSaverImpl)).get();
            if (list != null && !list.isEmpty()) {
                ArrayList arrayList7 = new ArrayList();
                for (C0M2 c0m2 : list) {
                    Iterator it2 = arrayList6.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            C15680pA c15680pA3 = (C15680pA) it2.next();
                            if (c0m2.A08.containsAll(Arrays.asList(c15680pA3.A02))) {
                                arrayList7.add(new C15660p7(c0m2, new ComponentName(applicationContext.getPackageName(), c15680pA3.A00)));
                                break;
                            }
                        }
                    }
                }
                if (arrayList7.isEmpty()) {
                    return new ArrayList();
                }
                Collections.sort(arrayList7);
                ArrayList arrayList8 = new ArrayList();
                int i2 = ((C15660p7) arrayList7.get(0)).A01.A00;
                Iterator it3 = arrayList7.iterator();
                float f = 1.0f;
                while (it3.hasNext()) {
                    C15660p7 c15660p7 = (C15660p7) it3.next();
                    C0M2 c0m22 = c15660p7.A01;
                    Icon icon = null;
                    try {
                        final String str = c0m22.A07;
                        final C15810pN c15810pN = (C15810pN) executorService.submit(new Callable() { // from class: X.0pH
                            @Override // java.util.concurrent.Callable
                            public Object call() {
                                return ShortcutInfoCompatSaverImpl.this.A04.get(str);
                            }
                        }).get();
                        iconCompat = null;
                        if (c15810pN != null) {
                            String str2 = c15810pN.A02;
                            if (!TextUtils.isEmpty(str2)) {
                                try {
                                    identifier = shortcutInfoCompatSaverImpl.A00.getResources().getIdentifier(str2, null, null);
                                } catch (Exception unused) {
                                }
                                if (identifier != 0) {
                                    iconCompat = IconCompat.A02(shortcutInfoCompatSaverImpl.A00, identifier);
                                }
                            }
                            if (!TextUtils.isEmpty(c15810pN.A01) && (bitmap = (Bitmap) shortcutInfoCompatSaverImpl.A06.submit(new Callable() { // from class: X.0pI
                                @Override // java.util.concurrent.Callable
                                public Object call() {
                                    return BitmapFactory.decodeFile(C15810pN.this.A01);
                                }
                            }).get()) != null) {
                                iconCompat = IconCompat.A04(bitmap);
                            }
                        }
                    } catch (Exception e2) {
                        Log.e("ChooserServiceCompat", "Failed to retrieve shortcut icon: ", e2);
                        iconCompat = null;
                    }
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("android.intent.extra.shortcut.ID", c0m22.A07);
                    int i3 = c0m22.A00;
                    if (i2 != i3) {
                        f -= 0.01f;
                        i2 = i3;
                    }
                    CharSequence charSequence = c0m22.A05;
                    if (iconCompat != null) {
                        icon = iconCompat.A07();
                    }
                    arrayList8.add(new ChooserTarget(charSequence, icon, f, c15660p7.A00, bundle2));
                }
                return arrayList8;
            }
            return Collections.emptyList();
        } catch (Exception e3) {
            Log.e("ChooserServiceCompat", "Failed to retrieve shortcuts: ", e3);
            return Collections.emptyList();
        }
    }
}
