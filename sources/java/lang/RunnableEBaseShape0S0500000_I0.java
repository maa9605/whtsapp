package java.lang;

import X.AnonymousClass092;
import X.AnonymousClass094;
import X.AnonymousClass097;
import X.C000200d;
import X.C002301c;
import X.C010805j;
import X.C04360Jw;
import X.C04420Kc;
import X.C05140Nm;
import X.C05160No;
import X.C05190Nr;
import X.C09H;
import X.C0C9;
import X.C0ES;
import X.C0JX;
import X.C0R5;
import X.C1u5;
import X.C25P;
import X.C2E4;
import X.C2K9;
import X.C2TX;
import X.C40531sQ;
import X.C41501u1;
import X.C41601uD;
import X.C42451vl;
import X.C43211x2;
import X.C43221x3;
import X.C44011yN;
import X.C48702Gi;
import X.C48732Gl;
import X.C52342aZ;
import X.C54002ht;
import X.C54012hu;
import X.C54022hv;
import X.C55352kH;
import X.InterfaceC43821y3;
import X.InterfaceC52362ab;
import X.RunnableC55322kE;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.simplejni.NativeHolder;
import com.whatsapp.filter.SmoothScrollLinearLayoutManager;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.SendE2EMessageJob;
import com.whatsapp.storage.StorageUsageActivity;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.io.File;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public class RunnableEBaseShape0S0500000_I0 extends RunnableEmptyBase implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;

    public RunnableEBaseShape0S0500000_I0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.A05 = i;
        this.A04 = obj;
        this.A00 = obj2;
        this.A01 = obj3;
        this.A03 = obj4;
        this.A02 = obj5;
    }

    @Override // java.lang.Runnable
    public void run() {
        switch (this.A05) {
            case 0:
                if (((C52342aZ) this.A04).A04) {
                    return;
                }
                ImageView imageView = (ImageView) this.A01;
                if (imageView.getTag() == null || !imageView.getTag().equals(this.A03)) {
                    return;
                }
                ((InterfaceC52362ab) this.A02).AUd(imageView, (Bitmap) this.A00, false);
                return;
            case 1:
                final C0ES c0es = (C0ES) this.A00;
                C05160No c05160No = (C05160No) this.A01;
                AnonymousClass092 anonymousClass092 = (AnonymousClass092) this.A02;
                final File file = (File) this.A03;
                final File file2 = (File) this.A04;
                SystemClock.sleep(300L);
                StringBuilder sb = new StringBuilder("group/create again, jid:");
                sb.append(c05160No);
                sb.append(" subject:");
                sb.append(anonymousClass092.A0G());
                Log.w(sb.toString());
                new C55352kH(c0es.A04, c0es.A0a, c0es, new C2K9(c0es.A0D, c0es.A0j, c0es.A0L, c0es, c0es.A0g, c0es.A0J, c05160No, anonymousClass092.A0G(), ((C04360Jw) anonymousClass092).A01) { // from class: X.2kG
                    @Override // X.C0T9
                    public void ARw(Jid jid) {
                        C011005l c011005l = (C011005l) jid;
                        super.A01(c011005l);
                        C0ES c0es2 = c0es;
                        C06C A0A = c0es2.A08.A0A(c011005l);
                        File file3 = file;
                        C011505r c011505r = c0es2.A0A;
                        if (!file3.renameTo(c011505r.A03(A0A))) {
                            StringBuilder A0P = C000200d.A0P("group/create again, failed to rename ");
                            A0P.append(file3.getAbsolutePath());
                            A0P.append(" to ");
                            A0P.append(c011505r.A03(A0A).getAbsolutePath());
                            Log.w(A0P.toString());
                        }
                        File file4 = file2;
                        if (!file4.renameTo(c011505r.A04(A0A))) {
                            StringBuilder A0P2 = C000200d.A0P("group/create again, failed to rename ");
                            A0P2.append(file4.getAbsolutePath());
                            A0P2.append(" to ");
                            A0P2.append(c011505r.A04(A0A).getAbsolutePath());
                            Log.w(A0P2.toString());
                        }
                        c0es2.A0f.A07(A0A);
                    }
                }).A00(false);
                return;
            case 2:
                SendE2EMessageJob sendE2EMessageJob = (SendE2EMessageJob) this.A00;
                AnonymousClass094 anonymousClass094 = (AnonymousClass094) this.A01;
                Collection<DeviceJid> collection = (Collection) this.A02;
                AnonymousClass092 anonymousClass0922 = (AnonymousClass092) this.A03;
                Map map = (Map) this.A04;
                collection.retainAll(sendE2EMessageJob.A0F(anonymousClass094));
                for (DeviceJid deviceJid : collection) {
                    UserJid of = UserJid.of(anonymousClass094.A00);
                    C40531sQ A0B = sendE2EMessageJob.A0B(anonymousClass094, deviceJid, sendE2EMessageJob.A0N);
                    if (of == null) {
                        of = deviceJid.userJid;
                    }
                    C010805j A01 = SendE2EMessageJob.A01(sendE2EMessageJob.A09(deviceJid, sendE2EMessageJob.A0A(of, A0B), anonymousClass0922));
                    if (A01 != null) {
                        map.put(deviceJid, A01);
                    }
                }
                return;
            case 3:
                C48702Gi c48702Gi = (C48702Gi) this.A00;
                Context context = (Context) this.A01;
                C44011yN c44011yN = (C44011yN) this.A02;
                C002301c c002301c = (C002301c) this.A03;
                View view = (View) this.A04;
                if (c48702Gi.A0B == null) {
                    C48732Gl c48732Gl = new C48732Gl(context, c44011yN, c002301c, c48702Gi);
                    c48702Gi.A0B = c48732Gl;
                    RecyclerView recyclerView = c48702Gi.A0Q;
                    recyclerView.setAdapter(c48732Gl);
                    view.getContext();
                    recyclerView.setLayoutManager(new SmoothScrollLinearLayoutManager());
                    return;
                }
                return;
            case 4:
                C2E4 c2e4 = (C2E4) this.A00;
                C04420Kc c04420Kc = (C04420Kc) this.A01;
                AnonymousClass094 anonymousClass0942 = (AnonymousClass094) this.A02;
                Object obj = this.A03;
                byte[] bArr = (byte[]) this.A04;
                C05140Nm A04 = c2e4.A0V.A04(c04420Kc.A00);
                if (A04 != null) {
                    A04.A00(3);
                }
                C0C9 c0c9 = c2e4.A0L;
                AnonymousClass092 A0F = c0c9.A0F(anonymousClass0942);
                if (A0F instanceof AnonymousClass097) {
                    AnonymousClass097 anonymousClass097 = (AnonymousClass097) A0F;
                    C09H c09h = anonymousClass097.A02;
                    if (c09h != null) {
                        StringBuilder sb2 = new StringBuilder("media auto download re-enabled; stanzaKey=");
                        sb2.append(c04420Kc);
                        sb2.append("; key=");
                        sb2.append(anonymousClass0942);
                        Log.i(sb2.toString());
                        try {
                            String str = anonymousClass0942.A01;
                            byte[] bArr2 = c09h.A0U;
                            if (bArr2 != null) {
                                String str2 = null;
                                if (obj != null && bArr != null) {
                                    C41501u1 c41501u1 = c2e4.A0R;
                                    C41501u1.A01(bArr2, bArr);
                                    if (c41501u1.A00.A00 != null) {
                                        NativeHolder nativeHolder = (NativeHolder) JniBridge.jvidispatchOOOOO(3, str, obj, bArr2, bArr);
                                        if (nativeHolder != null) {
                                            C0R5 c0r5 = new C0R5(nativeHolder);
                                            JniBridge jniBridge = JniBridge.getInstance();
                                            NativeHolder nativeHolder2 = c0r5.A00;
                                            if (jniBridge != null) {
                                                str2 = (String) JniBridge.jvidispatchOIO(1, 24, nativeHolder2);
                                            } else {
                                                throw null;
                                            }
                                        } else {
                                            throw new C0JX("encrypted message id is different from the expected one");
                                        }
                                    } else {
                                        throw null;
                                    }
                                }
                                if (!TextUtils.isEmpty(str2)) {
                                    c09h.A0G = str2;
                                }
                                c09h.A0L = true;
                                c0c9.A0T(anonymousClass097);
                                C41601uD c41601uD = c2e4.A0Q;
                                C42451vl c42451vl = c41601uD.A06;
                                if (c42451vl != null) {
                                    C09H c09h2 = anonymousClass097.A02;
                                    if (c09h2 == null) {
                                        StringBuilder A0P = C000200d.A0P("MediaDownloadManager/resumeReuploadingDownload/MMS unable to resume download due to missing media data; message.key = ");
                                        A0P.append(anonymousClass097.A0n);
                                        A0P.append(", message.mediaHash=");
                                        C000200d.A1M(A0P, anonymousClass097.A06);
                                    } else if (!c09h2.A0a) {
                                        StringBuilder A0P2 = C000200d.A0P("MediaDownloadManager/resumeReuploadingDownload/MMS unable to resume download; not transferring; message.key = ");
                                        A0P2.append(anonymousClass097.A0n);
                                        A0P2.append(", message.mediaHash=");
                                        C000200d.A1M(A0P2, anonymousClass097.A06);
                                    } else {
                                        C43221x3 A00 = c42451vl.A0R.A00(c09h2);
                                        if (A00 != null) {
                                            if (str2 != null) {
                                                C43211x2 c43211x2 = A00.A0Y;
                                                synchronized (c43211x2) {
                                                    c43211x2.A0G = str2;
                                                }
                                            }
                                            A00.A0m.countDown();
                                            Log.i("media retry notification; resume reuploading download");
                                        } else {
                                            StringBuilder A0P3 = C000200d.A0P("MediaDownloadManager/resumeReuploadingDownload/MMS unable to resume download; downloader not found; message.key = ");
                                            A0P3.append(anonymousClass097.A0n);
                                            A0P3.append(", message.mediaHash=");
                                            C000200d.A1M(A0P3, anonymousClass097.A06);
                                        }
                                    }
                                    c41601uD.A02(anonymousClass097);
                                    Log.i("media retry notification; queue auto download");
                                } else {
                                    throw null;
                                }
                            } else {
                                throw null;
                            }
                        } catch (C0JX e) {
                            Log.w("malformed encrypted data", e);
                            c2e4.A0T.A07(c04420Kc);
                            return;
                        }
                    } else {
                        StringBuilder sb3 = new StringBuilder("missing media data for media message; stanzaKey=");
                        sb3.append(c04420Kc);
                        sb3.append("; key=");
                        sb3.append(anonymousClass0942);
                        Log.w(sb3.toString());
                    }
                }
                c2e4.A0T.A07(c04420Kc);
                return;
            case 5:
                C1u5 c1u5 = (C1u5) this.A00;
                DeviceJid deviceJid2 = (DeviceJid) this.A01;
                C05190Nr c05190Nr = (C05190Nr) this.A02;
                C2TX c2tx = (C2TX) this.A03;
                Object obj2 = this.A04;
                try {
                    if (c1u5.A0i.A09(deviceJid2, c05190Nr.A0V, c05190Nr.A07)) {
                        new RunnableC55322kE(c1u5.A03, c1u5.A1P, c1u5.A07, c1u5.A0p, c1u5.A14, c1u5.A0g, c1u5.A0D, c1u5.A13, c1u5.A09, c1u5.A0n, c1u5.A04, c1u5.A0U, c1u5.A0V, c1u5.A0q, c05190Nr, c1u5.A0Z, c1u5.A05, c1u5.A0O, c1u5.A0Q, c1u5.A18, c1u5.A0r, c1u5.A0J, c1u5.A0x, c1u5.A0H, c2tx, c1u5.A1L, c1u5.A0T).run();
                    } else if (!c1u5.A03.A09(deviceJid2)) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("MessagingXmppHandler/onMessageForMe/invalid adv sender=");
                        sb4.append(deviceJid2);
                        Log.e(sb4.toString());
                        c1u5.A05(c05190Nr);
                    } else {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("MessagingXmppHandler/onMessageForMe/invalid self device identity, jid=");
                        sb5.append(deviceJid2);
                        Log.e(sb5.toString());
                        c1u5.A02(deviceJid2, c05190Nr);
                    }
                    Set set = c1u5.A1T;
                    synchronized (set) {
                        set.remove(obj2);
                        c1u5.A00--;
                    }
                    return;
                } catch (Throwable th) {
                    Set set2 = c1u5.A1T;
                    synchronized (set2) {
                        set2.remove(obj2);
                        c1u5.A00--;
                        throw th;
                    }
                }
            case 6:
                StorageUsageActivity storageUsageActivity = (StorageUsageActivity) this.A00;
                C54012hu c54012hu = (C54012hu) this.A01;
                C25P c25p = (C25P) this.A02;
                C25P c25p2 = (C25P) this.A03;
                C54002ht c54002ht = (C54002ht) this.A04;
                C54022hv c54022hv = storageUsageActivity.A0L;
                if (c54012hu != null && c54022hv.A02 == null) {
                    c54022hv.A02 = c54012hu;
                    c54022hv.A02(c54022hv.A0J(1));
                }
                if (c25p != null && c54022hv.A01 == null) {
                    c54022hv.A01 = c25p;
                    c54022hv.A0K();
                }
                if (c25p2 != null && c54022hv.A00 == null) {
                    c54022hv.A00 = c25p2;
                    c54022hv.A0K();
                }
                if (c54002ht.A04 != null) {
                    Log.i("storage-usage-activity/fetch cache/fetched media size");
                    storageUsageActivity.A1R(0);
                }
                if (c25p != null) {
                    Log.i("storage-usage-activity/fetch cache/fetched large files");
                    storageUsageActivity.A1R(1);
                }
                if (c25p2 != null) {
                    Log.i("storage-usage-activity/fetch cache/fetched forwarded files");
                    storageUsageActivity.A1R(2);
                    return;
                }
                return;
            case 7:
                Object obj3 = this.A00;
                View view2 = (View) this.A01;
                InterfaceC43821y3 interfaceC43821y3 = (InterfaceC43821y3) this.A02;
                Bitmap bitmap = (Bitmap) this.A03;
                AnonymousClass092 anonymousClass0923 = (AnonymousClass092) this.A04;
                if (obj3.equals(view2.getTag())) {
                    interfaceC43821y3.AUc(view2, bitmap, anonymousClass0923);
                    return;
                }
                return;
            case 8:
                Object obj4 = this.A00;
                View view3 = (View) this.A01;
                InterfaceC43821y3 interfaceC43821y32 = (InterfaceC43821y3) this.A02;
                Bitmap bitmap2 = (Bitmap) this.A03;
                AnonymousClass092 anonymousClass0924 = (AnonymousClass092) this.A04;
                if (obj4.equals(view3.getTag())) {
                    interfaceC43821y32.AUc(view3, bitmap2, anonymousClass0924);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
