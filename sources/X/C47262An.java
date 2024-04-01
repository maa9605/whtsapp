package X;

import android.content.Context;
import android.content.pm.PackageManager;
import com.whatsapp.util.Log;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.2An */
/* loaded from: classes2.dex */
public class C47262An {
    public static final String[] A04 = {"biz.stachibana.TaskKiller", "cn.com.android.opda.taskman", "com.arron.taskManager", "com.arron.taskManagerFree", "com.bright.taskcleaner.activity", "com.cool.taskkiller", "com.elnware.ActiveAppsAds", "com.estrongs.android.taskmanager", "com.gau.go.launcherex.gowidget.taskmanagerex", "com.ijinshan.kbatterydoctor", "com.ijinshan.kbatterydoctor_en", "com.iobit.mobilecare", "com.james.SmartTaskManager", "com.james.SmartTaskManagerLite", "com.james.SmartTaskManagerPro", "com.latedroid.juicedefender", "com.latedroid.juicedefender.beta", "com.latedroid.juicedefender.plus", "com.latedroid.ultimatejuice", "com.latedroid.ultimatejuice.root", "com.lookout.zapper", "com.mobo.task.killer", "com.netqin.aotkiller", "com.netqin.mobileguard", "com.rechild.advancedtaskkiller", "com.rechild.advancedtaskkillerfroyo", "com.rechild.advancedtaskkillerpro", "com.rechild.cleaner", "com.rhythm.hexise.task", "com.sand.taskmanager", "com.sta_beers.auto_task", "com.symantec.monitor", "com.task.killer", "com.tni.TasKiller", "com.zdworks.android.toolbox", "com.zomut.watchdog", "com.zomut.watchdoglite", "gpc.myweb.hinet.net.TaskManager", "imoblife.memorybooster.lite", "jp.co.aplio.simpletaskkiller", "jp.co.aplio.simpletaskkillerfree", "jp.smapho.quicktaskkiller", "mobi.infolife.taskmanager", "mobi.infolife.taskmanagerpro", "net.lepeng.batterydoctor", "net.lepeng.superboxss"};
    public static final String[] A05 = {"com.agilesoftresource", "com.antivirus", "com.cleanmaster.mguard", "com.electricsheep.asi", "com.estrongs.android.pop", "com.estrongs.android.pop.cupcake", "com.metago.astro", "com.smartwho.SmartFileManager", "com.smartwho.SmartFileManagerPro", "nextapp.systempanel", "nextapp.systempanel.r1"};
    public static volatile C47262An A06;
    public final C2DR A00;
    public final InterfaceC002901k A01;
    public final CountDownLatch A02 = new CountDownLatch(1);
    public final AtomicReference A03 = new AtomicReference(new C2DQ(null, null));

    public C47262An(C001200o c001200o, InterfaceC002901k interfaceC002901k) {
        this.A01 = interfaceC002901k;
        this.A00 = new C2DR(this, c001200o);
    }

    public static C47262An A00() {
        if (A06 == null) {
            synchronized (C47262An.class) {
                if (A06 == null) {
                    A06 = new C47262An(C001200o.A01, C002801j.A00());
                }
            }
        }
        return A06;
    }

    public static Set A01(Context context, String[] strArr, String str) {
        CharSequence charSequence;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            HashSet hashSet = new HashSet();
            for (String str2 : strArr) {
                try {
                    try {
                        charSequence = packageManager.getApplicationInfo(str2, 0).loadLabel(packageManager);
                    } catch (Exception e) {
                        Log.e("exception during task-killer name lookup: ", e);
                        charSequence = str2;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(' ');
                    sb.append(str2);
                    Log.w(sb.toString());
                    hashSet.add(new C2DS(charSequence, str2));
                } catch (PackageManager.NameNotFoundException unused) {
                } catch (RuntimeException e2) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(' ');
                    sb2.append(e2.getMessage());
                    Log.e(sb2.toString());
                }
            }
            if (!hashSet.isEmpty()) {
                return hashSet;
            }
        }
        return null;
    }

    public C2DQ A02(int i, TimeUnit timeUnit) {
        C47262An c47262An = this.A00.A01;
        if (c47262An.A02.await(i, timeUnit)) {
            C2DQ c2dq = (C2DQ) c47262An.A03.get();
            Set set = c2dq.A00;
            if (set != null) {
                set.size();
            }
            Set set2 = c2dq.A01;
            if (set2 != null) {
                set2.size();
            }
            return c2dq;
        }
        throw new TimeoutException();
    }
}
