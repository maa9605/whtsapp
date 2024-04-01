package java.lang;

import X.AbstractC005302j;
import X.AbstractC09240cu;
import X.AbstractC42841wP;
import X.AbstractC44611zM;
import X.AnonymousClass092;
import X.AnonymousClass093;
import X.AnonymousClass097;
import X.AnonymousClass220;
import X.AnonymousClass255;
import X.AnonymousClass275;
import X.AnonymousClass276;
import X.AnonymousClass280;
import X.C000200d;
import X.C000700j;
import X.C002701i;
import X.C003101m;
import X.C01J;
import X.C02590Ca;
import X.C04200Je;
import X.C04420Kc;
import X.C04940Mo;
import X.C05140Nm;
import X.C05190Nr;
import X.C05260Ny;
import X.C05920Qu;
import X.C05W;
import X.C06C;
import X.C06M;
import X.C0CZ;
import X.C0F2;
import X.C0G5;
import X.C0HS;
import X.C0I2;
import X.C0IQ;
import X.C0JM;
import X.C0JU;
import X.C0KS;
import X.C0M6;
import X.C0ZA;
import X.C1u5;
import X.C20M;
import X.C20N;
import X.C22G;
import X.C22J;
import X.C22K;
import X.C22S;
import X.C22T;
import X.C22X;
import X.C23L;
import X.C28P;
import X.C28Q;
import X.C28R;
import X.C28T;
import X.C28U;
import X.C28V;
import X.C2AJ;
import X.C2AK;
import X.C2AV;
import X.C2AY;
import X.C2D0;
import X.C2E4;
import X.C2HE;
import X.C2IP;
import X.C2JQ;
import X.C2JR;
import X.C2JS;
import X.C2JU;
import X.C2JW;
import X.C2JX;
import X.C2K0;
import X.C2K1;
import X.C2K2;
import X.C2K4;
import X.C38D;
import X.C40301ry;
import X.C41421tt;
import X.C41521u3;
import X.C41541u6;
import X.C41631uG;
import X.C41691uM;
import X.C41981up;
import X.C41991uq;
import X.C462325s;
import X.C463926q;
import X.C464526w;
import X.C464726y;
import X.C48732Gl;
import X.C49032Ic;
import X.C50932Tx;
import X.C70643Tb;
import X.C70653Tc;
import X.C70663Td;
import X.C70673Te;
import X.C76803hB;
import X.InterfaceC41531u4;
import X.InterfaceC44391yz;
import X.RunnableC55322kE;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.os.Vibrator;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.SendWebForwardJob;
import com.whatsapp.mediacomposer.MediaComposerActivity;
import com.whatsapp.mediaview.MediaViewFragment;
import com.whatsapp.migration.android.view.GoogleMigrateImporterActivity;
import com.whatsapp.notification.AndroidWear;
import com.whatsapp.notification.PopupNotification;
import com.whatsapp.notification.PopupNotificationViewPager;
import com.whatsapp.qrcode.DevicePairQrScannerActivity;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.DefaultCryptoCallback;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.io.FileNotFoundException;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public class RunnableEBaseShape3S0200000_I0_3 extends RunnableEmptyBase implements Runnable {
    public Object A00;
    public Object A01;
    public final int A02;

    public RunnableEBaseShape3S0200000_I0_3(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v17, types: [X.22T, android.content.BroadcastReceiver] */
    /* JADX WARN: Type inference failed for: r3v18, types: [X.22S, android.content.BroadcastReceiver] */
    @Override // java.lang.Runnable
    public final void run() {
        C20M A9m;
        int i;
        String str;
        switch (this.A02) {
            case 0:
                ((C23L) this.A00).A0D.A05((AnonymousClass092) this.A01, 12);
                return;
            case 1:
                ((C2K4) this.A00).A01((AnonymousClass097) this.A01, new FileNotFoundException());
                return;
            case 2:
                MediaComposerActivity mediaComposerActivity = (MediaComposerActivity) this.A00;
                Window window = (Window) this.A01;
                if (mediaComposerActivity.A03.A01() == null) {
                    mediaComposerActivity.A0w = true;
                    window.setSharedElementEnterTransition(null);
                    mediaComposerActivity.A02.setVisibility(8);
                    mediaComposerActivity.A0T();
                    return;
                }
                return;
            case 3:
                C2K0 c2k0 = (C2K0) this.A00;
                C0JM c0jm = ((C2K2) ((C2K1) this.A01)).A01;
                String str2 = c0jm.A0B;
                if (str2 != null) {
                    if (c0jm.A02()) {
                        c2k0.A04.A05(c0jm);
                        return;
                    } else {
                        c2k0.A01.A04(str2);
                        return;
                    }
                }
                throw null;
            case 4:
                C0F2 c0f2 = ((C2K0) this.A00).A01;
                String str3 = ((C2K2) ((C2K1) this.A01)).A01.A0B;
                if (str3 != null) {
                    c0f2.A09(str3);
                    return;
                }
                throw null;
            case 5:
                C2JS c2js = (C2JS) this.A00;
                CharSequence charSequence = (CharSequence) this.A01;
                c2js.A00 = null;
                String charSequence2 = charSequence.toString();
                C2IP c2ip = c2js.A01;
                if (charSequence2.equals(c2ip.A0B) || c2ip.A0K.getVisibility() != 0) {
                    return;
                }
                c2ip.A07(charSequence.toString());
                return;
            case 6:
                ((View) this.A00).setLayoutParams((ViewGroup.LayoutParams) this.A01);
                return;
            case 7:
                ((C2IP) this.A00).A0I.setLayoutParams((ViewGroup.LayoutParams) this.A01);
                return;
            case 8:
                AbstractMap abstractMap = (AbstractMap) this.A01;
                C48732Gl c48732Gl = ((C2HE) this.A00).A00;
                c48732Gl.A00 = false;
                boolean z = false;
                for (Object obj : abstractMap.keySet()) {
                    int i2 = ((C2JR) C2JQ.A01.get(obj)).A00 - 1;
                    Object obj2 = abstractMap.get(obj);
                    if (i2 >= 0) {
                        boolean z2 = obj2 != null;
                        boolean[] zArr = c48732Gl.A02;
                        if (z2 != zArr[i2]) {
                            z = true;
                        }
                        zArr[i2] = z2;
                    }
                }
                if (z) {
                    c48732Gl.A01();
                    return;
                }
                return;
            case 9:
                MediaViewFragment mediaViewFragment = (MediaViewFragment) this.A00;
                AnonymousClass092 anonymousClass092 = (AnonymousClass092) this.A01;
                mediaViewFragment.A0m.A06(anonymousClass092.A0m != 3 ? 2 : 3, C003101m.A0U(anonymousClass092.A0n.A00) ? 2 : 1);
                return;
            case 10:
                MediaViewFragment mediaViewFragment2 = (MediaViewFragment) this.A00;
                Object obj3 = this.A01;
                Set A0K = mediaViewFragment2.A0K.A0K(Collections.singleton(obj3), false);
                if (!mediaViewFragment2.A0d.A06(Collections.singleton(obj3), true)) {
                    mediaViewFragment2.A0E.A0F(mediaViewFragment2.A0Y.A08(R.plurals.unstar_while_clearing_error, 1L), 0);
                    mediaViewFragment2.A0K.A0U(A0K);
                } else {
                    mediaViewFragment2.A0K.A0V(A0K);
                }
                mediaViewFragment2.A0E.A02.post(new RunnableEBaseShape4S0100000_I0_4(mediaViewFragment2, 11));
                return;
            case GoogleMigrateImporterActivity.A0E /* 11 */:
                MediaViewFragment mediaViewFragment3 = (MediaViewFragment) this.A00;
                Object obj4 = this.A01;
                Set A0K2 = mediaViewFragment3.A0K.A0K(Collections.singleton(obj4), true);
                mediaViewFragment3.A0d.A04(Collections.singleton(obj4), true, true);
                mediaViewFragment3.A0K.A0V(A0K2);
                mediaViewFragment3.A0E.A02.post(new RunnableEBaseShape4S0100000_I0_4(mediaViewFragment3, 10));
                return;
            case 12:
                final C22J c22j = (C22J) this.A00;
                C0KS c0ks = (C0KS) this.A01;
                Log.i("xmpp/client-ping/on-connected");
                Handler handler = c22j.A08;
                C000700j.A02(handler);
                c22j.A03();
                if (c22j.A05) {
                    if (c0ks == c22j.A03) {
                        Log.w("xmpp/client-ping/on-connected; already connected, ignoring.");
                        return;
                    }
                    Log.w("xmpp/client-ping/on-connected; new channel, forcing disconnect.");
                    Log.i("xmpp/client-ping/on-disconnected");
                    C000700j.A02(handler);
                    c22j.A03();
                    if (!c22j.A05) {
                        Log.w("xmpp/client-ping/on-disconnected; not connected, ignoring...");
                    } else {
                        if (c22j.A0D > 0) {
                            c22j.A02();
                        }
                        C000700j.A02(handler);
                        C22S c22s = c22j.A02;
                        if (c22s != null) {
                            c22j.A0C.A00.unregisterReceiver(c22s);
                            c22j.A02 = null;
                        }
                        Log.i("xmpp/client-ping/periodic/cancel-alarm");
                        c22j.A07(new Intent("com.whatsapp.alarm.CLIENT_PING_PERIODIC").setPackage("com.whatsapp"));
                        C000700j.A02(handler);
                        C22T c22t = c22j.A01;
                        if (c22t != null) {
                            c22j.A0C.A00.unregisterReceiver(c22t);
                            c22j.A01 = null;
                        }
                        c22j.A03 = null;
                        c22j.A05 = false;
                    }
                }
                c22j.A03 = c0ks;
                c22j.A00 = 0;
                c22j.A0D = 0L;
                c22j.A07 = false;
                c22j.A05 = true;
                C000700j.A02(handler);
                if (c22j.A01 != null) {
                    Log.w("xmpp/client-ping/periodic/register-receiver; duplicate receiver registration.");
                } else {
                    ?? r3 = new BroadcastReceiver() { // from class: X.22T
                        public volatile boolean A01 = false;
                        public final Object A00 = new Object();

                        @Override // android.content.BroadcastReceiver
                        public void onReceive(Context context, Intent intent) {
                            if (!this.A01) {
                                synchronized (this.A00) {
                                    if (!this.A01) {
                                        AnonymousClass029.A0Y(context);
                                        this.A01 = true;
                                    }
                                }
                            }
                            if (!"com.whatsapp.alarm.CLIENT_PING_PERIODIC".equals(intent.getAction())) {
                                StringBuilder sb = new StringBuilder("xmpp/client-ping/periodic/receiver; unexpected intent: ");
                                sb.append(intent);
                                Log.w(sb.toString());
                                return;
                            }
                            Log.i("xmpp/client-ping/periodic/receiver");
                            C22J c22j2 = c22j;
                            if (c22j2 != null) {
                                Log.i("xmpp/client-ping/send-ping");
                                C000700j.A02(c22j2.A08);
                                if (c22j2.A05 && c22j2.A03 != null) {
                                    if (c22j2.A0D > 0) {
                                        Log.w("xmpp/client-ping/send-ping; skipping ping request, pending ping already exists.");
                                        if (c22j2.A0D > 0) {
                                            if (SystemClock.elapsedRealtime() > c22j2.A00() + c22j2.A0D) {
                                                c22j2.A04();
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    }
                                    Log.i("xmpp/client-ping/periodic/cancel-alarm");
                                    c22j2.A07(new Intent("com.whatsapp.alarm.CLIENT_PING_PERIODIC").setPackage("com.whatsapp"));
                                    c22j2.A0D = SystemClock.elapsedRealtime();
                                    c22j2.A07 = false;
                                    Log.i("xmpp/client-ping/timeout/schedule-alarm");
                                    PendingIntent broadcast = PendingIntent.getBroadcast(c22j2.A0C.A00, 0, new Intent("com.whatsapp.alarm.CLIENT_PING_TIMEOUT").setPackage("com.whatsapp"), 134217728);
                                    long elapsedRealtime = SystemClock.elapsedRealtime() + c22j2.A00();
                                    AlarmManager A02 = c22j2.A0B.A02();
                                    if (A02 == null) {
                                        Log.w("xmpp/client-ping/timeout/schedule-alarm; failed to schedule alarm");
                                    } else {
                                        int i3 = Build.VERSION.SDK_INT;
                                        if (i3 >= 23) {
                                            A02.setExactAndAllowWhileIdle(2, elapsedRealtime, broadcast);
                                        } else if (i3 >= 19) {
                                            A02.setExact(2, elapsedRealtime, broadcast);
                                        } else {
                                            A02.set(2, elapsedRealtime, broadcast);
                                        }
                                    }
                                    c22j2.A03.ASQ();
                                    c22j2.A00++;
                                    return;
                                }
                                Log.w("xmpp/client-ping/send-ping; not connected, ignoring.");
                                return;
                            }
                            throw null;
                        }
                    };
                    c22j.A01 = r3;
                    c22j.A0C.A00.registerReceiver(r3, new IntentFilter("com.whatsapp.alarm.CLIENT_PING_PERIODIC"), "com.whatsapp.permission.BROADCAST", handler);
                }
                c22j.A06();
                C000700j.A02(handler);
                if (c22j.A02 != null) {
                    Log.w("xmpp/client-ping/timeout/register-receiver; duplicate receiver registration.");
                } else {
                    ?? r32 = new BroadcastReceiver() { // from class: X.22S
                        public volatile boolean A01 = false;
                        public final Object A00 = new Object();

                        @Override // android.content.BroadcastReceiver
                        public void onReceive(Context context, Intent intent) {
                            if (!this.A01) {
                                synchronized (this.A00) {
                                    if (!this.A01) {
                                        AnonymousClass029.A0Y(context);
                                        this.A01 = true;
                                    }
                                }
                            }
                            if (!"com.whatsapp.alarm.CLIENT_PING_TIMEOUT".equals(intent.getAction())) {
                                StringBuilder sb = new StringBuilder("xmpp/client-ping/timeout/receiver; unexpected intent: ");
                                sb.append(intent);
                                Log.w(sb.toString());
                                return;
                            }
                            Log.i("xmpp/client-ping/timeout/receiver");
                            c22j.A04();
                        }
                    };
                    c22j.A02 = r32;
                    c22j.A0C.A00.registerReceiver(r32, new IntentFilter("com.whatsapp.alarm.CLIENT_PING_TIMEOUT"), "com.whatsapp.permission.BROADCAST", handler);
                }
                c22j.A02();
                return;
            case 13:
                C50932Tx c50932Tx = (C50932Tx) this.A00;
                C05W c05w = c50932Tx.A09;
                C06C A0A = c05w.A0A((AbstractC005302j) this.A01);
                c05w.A0G();
                c50932Tx.A0S.A03(A0A);
                return;
            case 14:
                ((C50932Tx) this.A00).A0W.A02((AnonymousClass093) this.A01);
                return;
            case 15:
                AnonymousClass092 anonymousClass0922 = (AnonymousClass092) this.A01;
                C2AV c2av = ((C2D0) this.A00).A02.A01;
                c2av.A0G.A01(anonymousClass0922);
                c2av.A0C.A02(anonymousClass0922);
                return;
            case GlVideoRenderer.CAP_RENDER_I420 /* 16 */:
                AnonymousClass092 anonymousClass0923 = (AnonymousClass092) this.A01;
                C2AV c2av2 = ((C2D0) this.A00).A02.A01;
                c2av2.A0G.A01(anonymousClass0923);
                c2av2.A0C.A02(anonymousClass0923);
                return;
            case 17:
                C06M c06m = ((C2E4) this.A00).A08;
                UserJid userJid = ((DeviceJid) this.A01).userJid;
                C000700j.A01();
                Iterator it = c06m.A00.iterator();
                while (true) {
                    C0G5 c0g5 = (C0G5) it;
                    if (!c0g5.hasNext()) {
                        return;
                    }
                    AbstractC09240cu abstractC09240cu = (AbstractC09240cu) c0g5.next();
                    abstractC09240cu.A01(userJid);
                    abstractC09240cu.A00(userJid);
                }
            case 18:
                ((C2E4) this.A00).A0T.A07((C04420Kc) this.A01);
                return;
            case 19:
                C22K c22k = (C22K) this.A00;
                C04420Kc c04420Kc = (C04420Kc) this.A01;
                C05140Nm A04 = c22k.A0B.A04(c04420Kc.A00);
                if (A04 != null) {
                    A04.A00(3);
                }
                C01J c01j = c22k.A07;
                Jid jid = c04420Kc.A01;
                if (c01j.A0A(C002701i.A0T(DeviceJid.of(jid))) != null) {
                    c22k.A02.A03(new DeviceJid[]{DeviceJid.of(jid)}, true, 8);
                }
                if (A04 != null) {
                    A04.A00(4);
                }
                c22k.A0A.A0L(c04420Kc);
                return;
            case C0M6.A01 /* 20 */:
                C22K c22k2 = (C22K) this.A00;
                C04420Kc c04420Kc2 = (C04420Kc) this.A01;
                C05140Nm A042 = c22k2.A0B.A04(c04420Kc2.A00);
                if (A042 != null) {
                    A042.A00(3);
                }
                Log.i("appending additional prekeys");
                C01J c01j2 = c22k2.A07;
                c01j2.A0H.A00();
                if (!c01j2.A00.A09()) {
                    Log.i("no unsent prekeys; generating some new ones");
                    c01j2.A0J();
                }
                c22k2.A01.A04();
                if (A042 != null) {
                    A042.A00(4);
                }
                c22k2.A0A.A0L(c04420Kc2);
                return;
            case 21:
                ((C22K) this.A00).A00((DeviceJid) this.A01);
                return;
            case 22:
                Object obj5 = this.A01;
                C76803hB c76803hB = ((C2AK) this.A00).A12.A00;
                if (c76803hB != null) {
                    PopupNotification popupNotification = c76803hB.A00;
                    if (popupNotification != null) {
                        ArrayList arrayList = new ArrayList();
                        for (AnonymousClass092 anonymousClass0924 : popupNotification.A1f) {
                            AbstractC005302j abstractC005302j = anonymousClass0924.A0n.A00;
                            if (abstractC005302j != null && abstractC005302j.equals(obj5)) {
                                popupNotification.A1e.add(popupNotification.A1L.A0n);
                                arrayList.add(anonymousClass0924);
                            }
                        }
                        popupNotification.A1f.removeAll(arrayList);
                        popupNotification.A0W.A00.A04();
                        PopupNotificationViewPager popupNotificationViewPager = popupNotification.A1F;
                        popupNotificationViewPager.setAdapter(popupNotification.A0W);
                        popupNotificationViewPager.setCurrentItem(0);
                        popupNotification.A1c.add(obj5);
                        if (popupNotification.A1f.isEmpty()) {
                            popupNotification.A1J();
                            popupNotification.finish();
                            return;
                        }
                        return;
                    }
                    throw null;
                }
                return;
            case 23:
                C41521u3 c41521u3 = (C41521u3) this.A00;
                UserJid userJid2 = (UserJid) this.A01;
                C0IQ A01 = c41521u3.A0B.A01(userJid2);
                if (A01 != null) {
                    byte[] A0B = A01.A01.A0B();
                    String A00 = A01.A00.A00();
                    C462325s c462325s = new C462325s(c41521u3, userJid2);
                    C41981up c41981up = c41521u3.A0F;
                    ((AbstractC42841wP) c462325s).A00 = c41981up.A01().A03;
                    C41991uq c41991uq = c41521u3.A0G;
                    C0I2 c0i2 = new C0I2(c41991uq, c462325s);
                    String A03 = c41991uq.A03();
                    c41521u3.A04.A00.A01(new SendWebForwardJob(A03, c41981up.A01().A03, Message.obtain(null, 0, 53, 0, new C0ZA(A03, userJid2, A00, A0B, c0i2))));
                    return;
                }
                return;
            case 24:
                AnonymousClass275 anonymousClass275 = (AnonymousClass275) this.A00;
                C04420Kc c04420Kc3 = (C04420Kc) this.A01;
                AnonymousClass276 anonymousClass276 = anonymousClass275.A00;
                DeviceJid of = DeviceJid.of(c04420Kc3.A01);
                if (of != null) {
                    String str4 = c04420Kc3.A07;
                    if (str4 != null) {
                        StringBuilder sb = new StringBuilder("PeerMessageReceiptHandler/handleDeliveryReceipt/peerDevice: ");
                        sb.append(of);
                        sb.append("; msgId: ");
                        sb.append(str4);
                        Log.i(sb.toString());
                        C41421tt c41421tt = anonymousClass276.A00;
                        C0JU A043 = c41421tt.A04(of, str4);
                        if (A043 == null) {
                            Log.i("PeerMessageReceiptHandler/handleDeliveryReceipt/no such message");
                        } else if (A043 instanceof C04200Je) {
                            Log.i("PeerMessageReceiptHandler/handleDeliveryReceipt/skipping history sync notification message");
                        } else {
                            long j = A043.A0p;
                            if (c41421tt != null) {
                                C000700j.A00();
                                c41421tt.A07(Collections.singletonList(Long.valueOf(j)));
                            } else {
                                throw null;
                            }
                        }
                        anonymousClass275.A01.A0L(c04420Kc3);
                        return;
                    }
                    throw null;
                }
                throw null;
            case 25:
                AndroidWear androidWear = (AndroidWear) this.A00;
                androidWear.A03.A03((AbstractC005302j) ((C06C) this.A01).A03(AbstractC005302j.class), true, true);
                androidWear.A05.A0A(null, true, true, true);
                return;
            case 26:
                C40301ry c40301ry = (C40301ry) this.A00;
                AnonymousClass092 anonymousClass0925 = (AnonymousClass092) this.A01;
                if (anonymousClass0925 != null) {
                    Map map = c40301ry.A0l;
                    AbstractC005302j abstractC005302j2 = anonymousClass0925.A0n.A00;
                    if (abstractC005302j2 == null) {
                        throw null;
                    }
                    map.remove(abstractC005302j2);
                    return;
                }
                return;
            case 27:
                ((C40301ry) this.A00).A0N.A02((AbstractC005302j) this.A01);
                return;
            case 28:
                ((C28V) this.A00).A03((C28Q) this.A01);
                return;
            case 29:
                ((C28V) this.A00).A02((C28Q) this.A01);
                return;
            case 30:
                ((C28V) this.A00).A04((C02590Ca) this.A01);
                return;
            case 31:
                C28P c28p = (C28P) this.A00;
                C28R c28r = (C28R) this.A01;
                List<AnonymousClass093> A0V = c28p.A03.A0V(-1);
                int size = A0V.size();
                c28p.A01 = size;
                if (c28p.A00 > 0) {
                    c28p.A08.A07(null, C000200d.A0K(C000200d.A0P("starting sync for: "), size, " transactions"), null);
                    for (AnonymousClass093 anonymousClass093 : A0V) {
                        C000700j.A07(anonymousClass093.A0I != null);
                        C28T AA9 = c28p.A07.A03().AA9();
                        if (AA9 != null) {
                            AA9.AV3();
                        }
                        c28r.AVM(anonymousClass093);
                    }
                    return;
                }
                return;
            case DefaultCryptoCallback.E2E_CALL_KEY_LENGTH /* 32 */:
                ((C464526w) this.A00).A07.A02(null);
                return;
            case 33:
                ((C464526w) this.A00).A09.A02((AnonymousClass093) this.A01);
                return;
            case 34:
                C28U c28u = (C28U) this.A00;
                for (AnonymousClass093 anonymousClass0932 : (List) this.A01) {
                    c28u.A01.A07.A02(anonymousClass0932);
                }
                return;
            case 35:
                AnonymousClass220 anonymousClass220 = (AnonymousClass220) this.A00;
                C04940Mo c04940Mo = anonymousClass220.A02;
                c04940Mo.A03();
                Log.i(c04940Mo.A01(anonymousClass220.A07.A00, "", null, null, true, -1L, -1L, "NotCalculated", false, null));
                anonymousClass220.A00.A09("AppMessagingXmppHandler/onLogNotification", "", true);
                anonymousClass220.A0D.A0L((C04420Kc) this.A01);
                return;
            case 36:
                C2AJ c2aj = (C2AJ) this.A00;
                Object obj6 = this.A01;
                c2aj.A00.A0T(Collections.singleton(obj6));
                C41691uM c41691uM = c2aj.A02;
                c41691uM.A01(Collections.singleton(obj6));
                c41691uM.A00.post(new RunnableEBaseShape1S0200000_I0_1(c41691uM, obj6, 2));
                return;
            case 37:
                ((C22G) this.A00).A04.A02((AbstractC005302j) this.A01);
                return;
            case 38:
                UserJid userJid3 = (UserJid) this.A01;
                C22X c22x = ((C22G) this.A00).A0F;
                List A02 = c22x.A02(userJid3);
                Iterator it2 = ((AbstractCollection) A02).iterator();
                while (it2.hasNext()) {
                    c22x.A05.A06((AnonymousClass092) it2.next(), 1, false);
                }
                c22x.A0E.A0E(userJid3);
                c22x.A06.A01.post(new RunnableEBaseShape1S0200000_I0_1(c22x, A02, 49));
                return;
            case 39:
                C463926q c463926q = (C463926q) this.A00;
                AnonymousClass280 anonymousClass280 = (AnonymousClass280) this.A01;
                final C41541u6 c41541u6 = c463926q.A00;
                if (c41541u6.A0W()) {
                    for (String str5 : AbstractC44611zM.A08) {
                        c41541u6.A0Q.A05(str5, 0L);
                    }
                    final Map A022 = c41541u6.A0Q.A02();
                    c41541u6.A08.A00(new InterfaceC44391yz() { // from class: X.368
                        @Override // X.InterfaceC44391yz
                        public void APV() {
                            c41541u6.A08.A01(this);
                        }

                        @Override // X.InterfaceC44391yz
                        public void APW() {
                            C41541u6 c41541u62 = c41541u6;
                            c41541u62.A08.A01(this);
                            Map A023 = c41541u62.A0Q.A02();
                            C44331yt c44331yt = c41541u62.A0C;
                            boolean equals = A023.equals(A022);
                            if (c44331yt != null) {
                                C37141lw c37141lw = new C37141lw();
                                c37141lw.A00 = Boolean.valueOf(equals);
                                c44331yt.A04.A0B(c37141lw, null, false);
                                return;
                            }
                            throw null;
                        }
                    });
                    c41541u6.A0N();
                }
                c463926q.A03.A0P("syncd_app_state", anonymousClass280.A00);
                return;
            case 40:
                ((C464726y) this.A00).A03.A02((UserJid) this.A01);
                return;
            case 41:
                ((AnonymousClass255) this.A00).A02.A0F((Set) this.A01, null);
                return;
            case 42:
                C70673Te c70673Te = (C70673Te) this.A01;
                C2JW c2jw = ((C2JX) this.A00).A01;
                C2JU c2ju = c2jw.A00;
                C05920Qu c05920Qu = c2ju.A00;
                if (c05920Qu instanceof C38D) {
                    C38D c38d = (C38D) c05920Qu;
                    C0CZ c0cz = null;
                    if (c70673Te != null) {
                        String str6 = c70673Te.A04;
                        String str7 = c70673Te.A03;
                        C70663Td c70663Td = c70673Te.A02;
                        if (c70663Td != null) {
                            i = 2;
                        } else {
                            i = 0;
                            if (c70673Te.A01 != null) {
                                i = 1;
                            }
                        }
                        C70653Tc c70653Tc = c70673Te.A01;
                        String str8 = c70653Tc == null ? null : c70653Tc.A00;
                        if (c70663Td != null) {
                            str = c70663Td.A00;
                        } else {
                            str = null;
                        }
                        byte[] bArr = c70653Tc != null ? c70653Tc.A01 : null;
                        C70643Tb c70643Tb = c70673Te.A00;
                        c0cz = new C0CZ(str6, str7, i, str8, str, bArr, null, c70643Tb.A01, c70643Tb.A00, c70643Tb.A02);
                    }
                    c38d.A0F(c0cz);
                    c2ju.A01.A0A(c2ju.A00);
                    c2ju.A0E.AS1(new RunnableEBaseShape2S0100000_I0_2(c2jw, 9));
                    return;
                }
                return;
            case 43:
                RunnableC55322kE runnableC55322kE = (RunnableC55322kE) this.A00;
                Object obj7 = this.A01;
                runnableC55322kE.A06.A0T(Collections.singleton(obj7));
                C41691uM c41691uM2 = runnableC55322kE.A07;
                if (c41691uM2 == null) {
                    throw null;
                }
                c41691uM2.A01(Collections.singleton(obj7));
                return;
            case 44:
                ((RunnableC55322kE) this.A00).A0R.ARy((C0HS) this.A01, new Void[0]);
                return;
            case 45:
                ((C1u5) this.A00).A0U.A0j(((C05190Nr) this.A01).A04((byte) 31));
                return;
            case DefaultCryptoCallback.E2E_EXTENDED_V2_KEY_LENGTH /* 46 */:
                C1u5 c1u5 = (C1u5) this.A00;
                Object obj8 = this.A01;
                Log.i("MessagingXmppHandler/onOfflineComplete Cleaning up zombie calls");
                c1u5.A1S.A03().putLong("zombie_cleanup", c1u5.A0L.A01()).apply();
                c1u5.A1Q.A00.obtainMessage(1, new C49032Ic("check_ongoing_calls", null, Message.obtain(null, 0, obj8))).sendToTarget();
                return;
            case 47:
                ((C1u5) this.A00).A0U.A0j(((C05190Nr) this.A01).A04((byte) 11));
                return;
            case 48:
                C41631uG c41631uG = (C41631uG) this.A00;
                DeviceJid deviceJid = (DeviceJid) this.A01;
                c41631uG.A05.A02.A01(new C05260Ny(deviceJid));
                C2AY c2ay = c41631uG.A06;
                C000700j.A01();
                Iterator it3 = c2ay.A00.iterator();
                while (true) {
                    C0G5 c0g52 = (C0G5) it3;
                    if (!c0g52.hasNext()) {
                        return;
                    }
                    ((InterfaceC41531u4) c0g52.next()).AHg(deviceJid);
                }
            case 49:
                Object obj9 = this.A01;
                DevicePairQrScannerActivity devicePairQrScannerActivity = ((C20N) this.A00).A00;
                if (devicePairQrScannerActivity.AFE() || (A9m = devicePairQrScannerActivity.A0G.A00().A9m()) == null || !A9m.equals(obj9)) {
                    return;
                }
                devicePairQrScannerActivity.A01.A02.removeCallbacks(devicePairQrScannerActivity.A0N);
                devicePairQrScannerActivity.A04.AG7();
                devicePairQrScannerActivity.A1S();
                ((Vibrator) devicePairQrScannerActivity.getSystemService("vibrator")).vibrate(75L);
                devicePairQrScannerActivity.finish();
                return;
            default:
                return;
        }
    }
}
