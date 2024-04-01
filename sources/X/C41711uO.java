package X;

import android.app.AlarmManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.whatsapp.companiondevice.CompanionDeviceVerificationReceiver;
import com.whatsapp.identity.IdentityVerificationActivity;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/* renamed from: X.1uO */
/* loaded from: classes2.dex */
public class C41711uO extends AnonymousClass064 implements C0EK {
    public static volatile C41711uO A0M;
    public C20M A00;
    public boolean A02;
    public final AbstractC000600i A04;
    public final C0IK A05;
    public final C02L A06;
    public final C02E A07;
    public final AnonymousClass012 A08;
    public final C001200o A09;
    public final C000500h A0A;
    public final C002301c A0B;
    public final C01J A0C;
    public final C01R A0D;
    public final C44431z4 A0E;
    public final C0F4 A0F;
    public final C05Y A0G;
    public final C0EE A0H;
    public final ExecutorC004702d A0I;
    public final InterfaceC002901k A0J;
    public final Set A0L = new HashSet();
    public final Object A0K = new Object();
    public final Handler A03 = new Handler(Looper.getMainLooper());
    public Comparator A01 = new Comparator() { // from class: X.2tz
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            C0JV c0jv = (C0JV) obj;
            C0JV c0jv2 = (C0JV) obj2;
            long j = c0jv.A01;
            if (!(j == 0 && c0jv2.A01 == 0) && (j == 0 || c0jv2.A01 == 0)) {
                return j != 0 ? 1 : -1;
            }
            return (c0jv2.A00 > c0jv.A00 ? 1 : (c0jv2.A00 == c0jv.A00 ? 0 : -1));
        }
    };

    @Override // X.C0EK
    public int[] AAP() {
        return new int[]{213};
    }

    public C41711uO(AnonymousClass012 anonymousClass012, AbstractC000600i abstractC000600i, C02L c02l, C001200o c001200o, InterfaceC002901k interfaceC002901k, C0F4 c0f4, C05Y c05y, C01R c01r, C02E c02e, C002301c c002301c, C0EE c0ee, C01J c01j, C000500h c000500h, C0IK c0ik, C44431z4 c44431z4) {
        this.A08 = anonymousClass012;
        this.A04 = abstractC000600i;
        this.A06 = c02l;
        this.A09 = c001200o;
        this.A0J = interfaceC002901k;
        this.A0F = c0f4;
        this.A0G = c05y;
        this.A0D = c01r;
        this.A07 = c02e;
        this.A0B = c002301c;
        this.A0H = c0ee;
        this.A0C = c01j;
        this.A0A = c000500h;
        this.A05 = c0ik;
        this.A0E = c44431z4;
        this.A0I = new ExecutorC004702d(interfaceC002901k, false);
    }

    public static C41711uO A00() {
        if (A0M == null) {
            synchronized (C41711uO.class) {
                if (A0M == null) {
                    A0M = new C41711uO(AnonymousClass012.A00(), AbstractC000600i.A00(), C02L.A00(), C001200o.A01, C002801j.A00(), C0F4.A00(), C05Y.A01(), C01R.A02, C02E.A00(), C002301c.A00(), C0EE.A00(), C01J.A00(), C000500h.A00(), C0IK.A01(), C44431z4.A00());
                }
            }
        }
        return A0M;
    }

    public static void A01(C41711uO c41711uO, C20M c20m) {
        Set<C44501zB> set = ((AnonymousClass064) c41711uO).A00;
        synchronized (set) {
            for (C44501zB c44501zB : set) {
                if (c44501zB instanceof C20N) {
                    C20N c20n = (C20N) c44501zB;
                    c20n.A00.runOnUiThread(new RunnableEBaseShape3S0200000_I0_3(c20n, c20m, 49));
                } else if (c44501zB instanceof C20O) {
                    IdentityVerificationActivity identityVerificationActivity = ((C20O) c44501zB).A00;
                    C02L c02l = identityVerificationActivity.A0C;
                    c02l.A05();
                    identityVerificationActivity.A1U(c02l.A03);
                } else if (c44501zB instanceof C44491zA) {
                    C41541u6 c41541u6 = ((C44491zA) c44501zB).A00;
                    if (((AbstractCollection) c41541u6.A0N.A04()).size() == 1) {
                        C44331yt c44331yt = c41541u6.A0C;
                        long A05 = c44331yt.A01.A05();
                        C42961wc c42961wc = c44331yt.A00;
                        c42961wc.A02().putLong("syncd_first_companion_reg_logging_time", A05).apply();
                        long j = c42961wc.A03().getLong("syncd_last_companion_dereg_logging_time", 0L);
                        if (j != 0) {
                            c42961wc.A02().remove("syncd_last_companion_dereg_logging_time").apply();
                            C0Jg c0Jg = new C0Jg();
                            c0Jg.A00 = Long.valueOf(A05 - j);
                            c44331yt.A04.A0B(c0Jg, null, false);
                        }
                    }
                } else if (!(c44501zB instanceof C20P)) {
                    if (c44501zB instanceof C20Q) {
                        ((C20Q) c44501zB).A00.A1Q();
                    }
                } else {
                    C44441z5 c44441z5 = ((C20P) c44501zB).A00;
                    if (c44441z5.A04()) {
                        Log.e("SyncdDeleteAllDataApiHandler/onDeviceRegistered: This should be rare and suggested to check more logs.");
                    } else {
                        Log.i("SyncdDeleteAllDataApiHandler/onDeviceRegistered removeLastCompanionDeregTime");
                        c44441z5.A05.A02().remove("syncd_last_companion_dereg_time").apply();
                    }
                }
            }
        }
        final C0JV c0jv = c20m.A01;
        Location A02 = c41711uO.A05.A02(2, "CompanionDevice");
        if (A02 != null && A02.getTime() + 120000 > c41711uO.A08.A01()) {
            StringBuilder A0P = C000200d.A0P("CompanionDevice/location/last ");
            A0P.append(A02.getTime());
            Log.i(A0P.toString());
            c41711uO.A0B(c0jv, A02);
        } else {
            LocationListener locationListener = new LocationListener() { // from class: X.20Z
                @Override // android.location.LocationListener
                public void onProviderDisabled(String str) {
                }

                @Override // android.location.LocationListener
                public void onProviderEnabled(String str) {
                }

                @Override // android.location.LocationListener
                public void onStatusChanged(String str, int i, Bundle bundle) {
                }

                {
                    C41711uO.this = c41711uO;
                }

                @Override // android.location.LocationListener
                public void onLocationChanged(Location location) {
                    if (location != null) {
                        StringBuilder A0P2 = C000200d.A0P("CompanionDevice/location/changed ");
                        A0P2.append(location.getTime());
                        A0P2.append(" ");
                        A0P2.append(location.getAccuracy());
                        Log.i(A0P2.toString());
                        C41711uO c41711uO2 = C41711uO.this;
                        c41711uO2.A0B(c0jv, location);
                        c41711uO2.A05.A06(this);
                    }
                }
            };
            Handler handler = c41711uO.A03;
            handler.post(new RunnableEBaseShape2S0200000_I0_2(c41711uO, locationListener, 0));
            handler.postDelayed(new RunnableEBaseShape2S0200000_I0_2(c41711uO, locationListener, 2), 60000L);
        }
        C000500h c000500h = c41711uO.A0A;
        String rawString = c0jv.A05.getRawString();
        if (rawString != null) {
            String string = c000500h.A00.getString("companion_device_verification_ids", null);
            if (string != null) {
                rawString = C000200d.A0I(string, ",", rawString);
            }
            C000200d.A0i(c000500h, "companion_device_verification_ids", rawString);
            Application application = c41711uO.A09.A00;
            if (PendingIntent.getBroadcast(application, 0, new Intent(application, CompanionDeviceVerificationReceiver.class), 536870912) == null) {
                long currentTimeMillis = System.currentTimeMillis() + ((long) (new Random().nextDouble() * 1.08E7d)) + 3600000;
                AlarmManager A022 = c41711uO.A07.A02();
                if (A022 != null) {
                    PendingIntent broadcast = PendingIntent.getBroadcast(application, 0, new Intent(application, CompanionDeviceVerificationReceiver.class), 134217728);
                    if (Build.VERSION.SDK_INT >= 19) {
                        A022.setExact(0, currentTimeMillis, broadcast);
                    } else {
                        A022.set(0, currentTimeMillis, broadcast);
                    }
                } else {
                    Log.w("CompanionDevice/scheduleCompanionDeviceVerificationAlarm AlarmManager is null");
                }
            }
            c41711uO.A00 = null;
            return;
        }
        throw null;
    }

    public C0CI A02() {
        final C0CI c0ci = new C0CI();
        if (!this.A0H.A02()) {
            c0ci.A00(Boolean.FALSE);
            return c0ci;
        }
        this.A0J.ARy(new C0HS() { // from class: X.20a
            {
                C41711uO.this = this;
            }

            @Override // X.C0HS
            public Object A07(Object[] objArr) {
                return Boolean.valueOf(C41711uO.this.A0E());
            }

            @Override // X.C0HS
            public void A09(Object obj) {
                c0ci.A00(obj);
            }
        }, new Void[0]);
        return c0ci;
    }

    public final C0JV A03(DeviceJid deviceJid) {
        if (this.A0H.A02()) {
            return (C0JV) this.A0F.A04.A01().A00.get(deviceJid);
        }
        return null;
    }

    public List A04() {
        if (!this.A0H.A02()) {
            return new ArrayList();
        }
        return new ArrayList(this.A0F.A01().A03());
    }

    public List A05() {
        ArrayList arrayList;
        if (!this.A0H.A02()) {
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList(this.A0F.A04.A01().A03());
        }
        Collections.sort(arrayList, this.A01);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        long A05 = this.A08.A05();
        int i = 0;
        while (it.hasNext()) {
            C0JV c0jv = (C0JV) it.next();
            long j = c0jv.A01;
            if (j > 0) {
                if (C02620Cd.A00(A05, j) > 30) {
                    it.remove();
                    arrayList2.add(c0jv.A05);
                } else {
                    i++;
                }
            }
        }
        if (i > 20) {
            int size = arrayList.size();
            ArrayList arrayList3 = new ArrayList(arrayList.subList(size - (i - 20), size));
            arrayList.removeAll(arrayList3);
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((C0JV) it2.next()).A05);
            }
        }
        if (!arrayList2.isEmpty()) {
            this.A0F.A04(C07D.A01(arrayList2));
        }
        return arrayList;
    }

    public void A06() {
        synchronized (this.A0K) {
            C20M c20m = this.A00;
            if (c20m != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("companion-device-manager/device login canceled: ");
                sb.append(c20m.A01.A05);
                Log.i(sb.toString());
                A0C(this.A00.A01.A05, true);
                this.A00 = null;
                this.A02 = false;
            }
        }
    }

    public void A07(C20M c20m) {
        A00(new C450220c(this, c20m));
        C44431z4 c44431z4 = this.A0E;
        synchronized (c44431z4) {
            C000700j.A0A(c44431z4.A00.A01(), "Critical data bootstrap already in progress");
            C450420e c450420e = c44431z4.A00;
            c450420e.A01.A03();
            c450420e.A00.A03();
            Log.i("CriticalDataUploadManager/startCriticalDataBootstrap");
            c44431z4.A01 = c44431z4.A04.ASB(new RunnableEBaseShape2S0100000_I0_2(c44431z4, 39), 60000L);
        }
        C450520f c450520f = c44431z4.A03;
        synchronized (c450520f.A00) {
            Iterator it = c450520f.A00.iterator();
            while (true) {
                C0G5 c0g5 = (C0G5) it;
                if (c0g5.hasNext()) {
                    C41541u6 c41541u6 = ((AnonymousClass367) c0g5.next()).A00;
                    c41541u6.A0V.AS1(new RunnableEBaseShape0S0200000_I0_0(c41541u6, c20m, 45));
                }
            }
        }
    }

    public void A08(C07D c07d) {
        StringBuilder sb = new StringBuilder("companion-device-manager/onDeviceRemovedByServer/devices: ");
        sb.append(c07d);
        Log.i(sb.toString());
        this.A0I.execute(new RunnableEBaseShape0S0210000_I0(this, c07d, false, 6));
    }

    public final void A09(C07D c07d) {
        Set<C44501zB> set = super.A00;
        synchronized (set) {
            for (C44501zB c44501zB : set) {
                if (c44501zB instanceof C20O) {
                    IdentityVerificationActivity identityVerificationActivity = ((C20O) c44501zB).A00;
                    C02L c02l = identityVerificationActivity.A0C;
                    c02l.A05();
                    identityVerificationActivity.A1U(c02l.A03);
                } else if (c44501zB instanceof C450620g) {
                    C450620g c450620g = (C450620g) c44501zB;
                    Iterator it = c07d.iterator();
                    while (true) {
                        C04250Jl c04250Jl = (C04250Jl) it;
                        if (c04250Jl.hasNext()) {
                            c450620g.A00.A03.A06((DeviceJid) c04250Jl.next());
                        }
                    }
                } else if (c44501zB instanceof C44491zA) {
                    C44491zA c44491zA = (C44491zA) c44501zB;
                    c44491zA.A00.A0V.AS1(new RunnableEBaseShape0S0200000_I0_0(c44491zA, c07d, 44));
                } else if (c44501zB instanceof C450720h) {
                    C450720h c450720h = (C450720h) c44501zB;
                    C451120l c451120l = c450720h.A01;
                    c451120l.A00.A0P();
                    C000200d.A0j(c451120l.A01, "companion_reg_opt_in_enabled", false);
                    InterfaceC04240Jk interfaceC04240Jk = c450720h.A00;
                    if (interfaceC04240Jk != null) {
                        interfaceC04240Jk.A5S(Boolean.TRUE);
                    }
                    c451120l.A02.A01(c450720h);
                } else if (c44501zB instanceof C20P) {
                    C44441z5 c44441z5 = ((C20P) c44501zB).A00;
                    if (c44441z5.A04()) {
                        Log.i("SyncdDeleteAllDataApiHandler/onDeviceRemoved");
                        if (!c44441z5.A08.A0E()) {
                            C44331yt c44331yt = c44441z5.A04;
                            long j = c44441z5.A05.A03().getInt("syncd_dirty", -1) - 1;
                            if (c44331yt != null) {
                                C04230Jj c04230Jj = new C04230Jj();
                                c04230Jj.A00 = Long.valueOf(j);
                                c44331yt.A04.A0B(c04230Jj, null, false);
                            } else {
                                throw null;
                            }
                        }
                        c44441z5.A05.A05(0);
                        c44441z5.A01();
                    } else if (c44441z5.A02.A07(C01C.A3Q) > 0 && !c44441z5.A08.A0E()) {
                        Log.i("SyncdDeleteAllDataApiHandler/onDeviceRemoved setLastCompanionDeregTime");
                        c44441z5.A05.A02().putLong("syncd_last_companion_dereg_time", c44441z5.A06.A05()).apply();
                    }
                } else if (!(c44501zB instanceof C20Q)) {
                    if (c44501zB instanceof C450820i) {
                        C450820i c450820i = (C450820i) c44501zB;
                        if (!c07d.A00.isEmpty()) {
                            C450920j c450920j = c450820i.A00;
                            if (c450920j.A03()) {
                                long A01 = c450920j.A01.A01();
                                if (A01 != -1) {
                                    c450920j.A02(false, A01);
                                } else {
                                    Log.e("DeviceKeyIndexListUpdateHandler/updateKeyIndexList/fail to generate ts");
                                    c450920j.A01(-1);
                                }
                            }
                        }
                    }
                } else {
                    C20Q c20q = (C20Q) c44501zB;
                    c20q.A00.runOnUiThread(new RunnableEBaseShape1S0100000_I0_1(c20q, 21));
                }
            }
        }
    }

    public final void A0A(C0JV c0jv) {
        Set<C44501zB> set = super.A00;
        synchronized (set) {
            for (C44501zB c44501zB : set) {
                if (c44501zB instanceof C20Q) {
                    ((C20Q) c44501zB).A00.A1Q();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0B(X.C0JV r12, android.location.Location r13) {
        /*
            r11 = this;
            X.00o r0 = r11.A09
            android.app.Application r1 = r0.A00
            X.01c r0 = r11.A0B
            java.util.Locale r0 = r0.A0I()
            android.location.Geocoder r3 = new android.location.Geocoder
            r3.<init>(r1, r0)
            r2 = 0
            double r4 = r13.getLatitude()     // Catch: java.lang.Throwable -> L3b
            double r6 = r13.getLongitude()     // Catch: java.lang.Throwable -> L3b
            r8 = 1
            java.util.List r0 = r3.getFromLocation(r4, r6, r8)     // Catch: java.lang.Throwable -> L3b
            if (r0 == 0) goto L3b
            java.util.Iterator r1 = r0.iterator()     // Catch: java.lang.Throwable -> L3b
            r8 = r2
        L24:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> L3c
            if (r0 == 0) goto L3c
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Throwable -> L3c
            android.location.Address r0 = (android.location.Address) r0     // Catch: java.lang.Throwable -> L3c
            java.lang.String r8 = r0.getLocality()     // Catch: java.lang.Throwable -> L3c
            boolean r0 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> L3c
            if (r0 != 0) goto L24
            goto L3c
        L3b:
            r8 = r2
        L3c:
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L91
            X.0F4 r0 = r11.A0F
            com.whatsapp.jid.DeviceJid r9 = r12.A05
            X.0F8 r7 = r0.A04
            if (r7 == 0) goto L8a
            java.lang.String r0 = "place_name"
            android.content.ContentValues r10 = new android.content.ContentValues
            r10.<init>()
            r10.put(r0, r8)
            X.0F9 r0 = r7.A02
            X.0CD r6 = r0.A00()
            X.0CE r5 = r6.A02     // Catch: java.lang.Throwable -> L83
            java.lang.String r4 = "devices"
            java.lang.String r3 = "device_id = ?"
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L83
            r1 = 0
            java.lang.String r0 = r9.getRawString()     // Catch: java.lang.Throwable -> L83
            r2[r1] = r0     // Catch: java.lang.Throwable -> L83
            r5.A00(r4, r10, r3, r2)     // Catch: java.lang.Throwable -> L83
            monitor-enter(r7)     // Catch: java.lang.Throwable -> L83
            X.07E r0 = r7.A00     // Catch: java.lang.Throwable -> L80
            if (r0 == 0) goto L7e
            java.util.Map r0 = r0.A00     // Catch: java.lang.Throwable -> L80
            java.lang.Object r0 = r0.get(r9)     // Catch: java.lang.Throwable -> L80
            X.0JV r0 = (X.C0JV) r0     // Catch: java.lang.Throwable -> L80
            if (r0 == 0) goto L7e
            r0.A02 = r8     // Catch: java.lang.Throwable -> L80
        L7e:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L80
            goto L8b
        L80:
            r0 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L80
            throw r0     // Catch: java.lang.Throwable -> L83
        L83:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L85
        L85:
            r0 = move-exception
            r6.close()     // Catch: java.lang.Throwable -> L89
        L89:
            throw r0
        L8a:
            throw r2
        L8b:
            r6.close()
            r11.A0A(r12)
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41711uO.A0B(X.0JV, android.location.Location):void");
    }

    public void A0C(DeviceJid deviceJid, boolean z) {
        StringBuilder sb = new StringBuilder("companion-device-manager/logoutDeviceAndNotify: ");
        sb.append(deviceJid);
        sb.append(", remove on error: ");
        sb.append(z);
        Log.i(sb.toString());
        C451420o c451420o = new C451420o(this.A0G, new C451320n(this, z));
        c451420o.A00 = C07D.A00(deviceJid);
        C05Y c05y = c451420o.A02;
        String A02 = c05y.A02();
        C04P[] c04pArr = new C04P[1];
        if (deviceJid != null) {
            c04pArr[0] = new C04P("jid", deviceJid);
            C000200d.A1C("app/sendRemoveDeviceRequest success: ", c05y.A0B(237, A02, new C02590Ca("iq", new C04P[]{new C04P("to", C04260Jm.A00), new C04P("id", A02, null, (byte) 0), new C04P("xmlns", "md", null, (byte) 0), new C04P("type", "set", null, (byte) 0)}, new C02590Ca("remove-companion-device", c04pArr, null, null)), c451420o, 32000L));
            return;
        }
        throw null;
    }

    public void A0D(boolean z) {
        C000200d.A1C("companion-device-manager/logoutAllCompanionDevicesAndNotify/remove on error: ", z);
        C07D A02 = this.A0F.A04.A01().A02();
        if (!A02.A00.isEmpty()) {
            C451420o c451420o = new C451420o(this.A0G, new C451320n(this, z));
            c451420o.A00 = A02;
            C05Y c05y = c451420o.A02;
            String A022 = c05y.A02();
            C000200d.A1C("app/sendRemoveAllDevicesRequest success: ", c05y.A0B(237, A022, new C02590Ca("iq", new C04P[]{new C04P("to", C04260Jm.A00), new C04P("id", A022, null, (byte) 0), new C04P("xmlns", "md", null, (byte) 0), new C04P("type", "set", null, (byte) 0)}, new C02590Ca("remove-companion-device", new C04P[]{new C04P("all", "true", null, (byte) 0)}, null, null)), c451420o, 32000L));
            return;
        }
        A09(A02);
    }

    public boolean A0E() {
        return !((AbstractCollection) A04()).isEmpty();
    }

    public boolean A0F(C07E c07e, boolean z) {
        C07E A01 = this.A0F.A01();
        if (c07e != null) {
            HashSet hashSet = new HashSet();
            Iterator it = A01.A01().iterator();
            while (true) {
                C04250Jl c04250Jl = (C04250Jl) it;
                if (!c04250Jl.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) c04250Jl.next();
                Object key = entry.getKey();
                Map map = c07e.A00;
                if (!map.containsKey(key) || (z && ((Number) map.get(entry.getKey())).intValue() != ((C0JV) entry.getValue()).A03)) {
                    hashSet.add(entry.getKey());
                }
            }
            C07D c07d = new C07D(hashSet, null);
            Set set = c07d.A00;
            if (!set.isEmpty()) {
                A08(c07d);
            }
            ArrayList arrayList = new ArrayList();
            Iterator it2 = c07e.A01().iterator();
            while (true) {
                C04250Jl c04250Jl2 = (C04250Jl) it2;
                if (!c04250Jl2.hasNext()) {
                    break;
                }
                Map.Entry entry2 = (Map.Entry) c04250Jl2.next();
                Object key2 = entry2.getKey();
                C02L c02l = this.A06;
                c02l.A05();
                if (!key2.equals(c02l.A02)) {
                    Object key3 = entry2.getKey();
                    Map map2 = A01.A00;
                    if (!map2.containsKey(key3) || (z && ((C0JV) map2.get(entry2.getKey())).A03 != ((Number) entry2.getValue()).intValue())) {
                        arrayList.add(entry2.getKey());
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    DeviceJid deviceJid = (DeviceJid) it3.next();
                    synchronized (this.A0K) {
                        C20M c20m = this.A00;
                        if (c20m != null && c20m.A01.A05.equals(deviceJid)) {
                            C20M c20m2 = this.A00;
                            Set<C44501zB> set2 = super.A00;
                            synchronized (set2) {
                                for (C44501zB c44501zB : set2) {
                                    if (c44501zB instanceof C20N) {
                                        C20N c20n = (C20N) c44501zB;
                                        c20n.A00.runOnUiThread(new RunnableEBaseShape4S0200000_I0_4(c20n, c20m2, 1));
                                    }
                                }
                            }
                            this.A0I.execute(new RunnableEBaseShape2S0200000_I0_2(this, c20m2, 1));
                        } else {
                            A0C(deviceJid, true);
                            AbstractC000600i abstractC000600i = this.A04;
                            StringBuilder sb = new StringBuilder();
                            sb.append("toAdd=");
                            sb.append(arrayList);
                            abstractC000600i.A09("ContactSyncDevicesUpdater/update add unknown device of self", sb.toString(), false);
                        }
                    }
                }
            }
            return !set.isEmpty();
        } else if (A01.A00.isEmpty()) {
            return false;
        } else {
            A08(A01.A02());
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0014, code lost:
        if (r3.A02 == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0G(com.whatsapp.jid.DeviceJid r4) {
        /*
            r3 = this;
            java.lang.Object r2 = r3.A0K
            monitor-enter(r2)
            X.20M r0 = r3.A00     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L16
            X.0JV r0 = r0.A01     // Catch: java.lang.Throwable -> L19
            com.whatsapp.jid.DeviceJid r0 = r0.A05     // Catch: java.lang.Throwable -> L19
            boolean r0 = r0.equals(r4)     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L16
            boolean r1 = r3.A02     // Catch: java.lang.Throwable -> L19
            r0 = 1
            if (r1 != 0) goto L17
        L16:
            r0 = 0
        L17:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
            return r0
        L19:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41711uO.A0G(com.whatsapp.jid.DeviceJid):boolean");
    }

    @Override // X.C0EK
    public boolean AEN(int i, Message message) {
        String str;
        long A05;
        if (i == 213) {
            if (message != null) {
                C02590Ca c02590Ca = (C02590Ca) message.obj;
                DeviceJid deviceJid = (DeviceJid) c02590Ca.A09(DeviceJid.class, "from", this.A04);
                if (this.A06.A09(deviceJid)) {
                    C04P A0A = c02590Ca.A0A("type");
                    if (A0A != null) {
                        str = A0A.A03;
                    } else {
                        str = null;
                    }
                    if (str != null && !"available".equals(str)) {
                        if (!"unavailable".equals(str)) {
                            return true;
                        }
                        A05 = C40731sm.A05(c02590Ca);
                        this.A0L.remove(deviceJid);
                    } else {
                        A05 = this.A08.A05();
                        this.A0L.add(deviceJid);
                    }
                    if (A05 != 0) {
                        this.A0J.AS1(new RunnableEBaseShape0S0200100_I0(this, deviceJid, A05, 1));
                        return true;
                    }
                    return true;
                }
                return true;
            }
            return true;
        }
        return false;
    }
}
