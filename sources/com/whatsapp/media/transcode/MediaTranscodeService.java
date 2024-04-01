package com.whatsapp.media.transcode;

import X.AbstractC005302j;
import X.AnonymousClass092;
import X.AnonymousClass097;
import X.C000200d;
import X.C002301c;
import X.C002701i;
import X.C003101m;
import X.C005402l;
import X.C00A;
import X.C00T;
import X.C018708s;
import X.C03020Dv;
import X.C05W;
import X.C06C;
import X.C09H;
import X.C0DU;
import X.C0IN;
import X.C2BL;
import X.C41771uU;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.text.TextUtils;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.HomeActivity;
import com.whatsapp.jid.Jid;
import com.whatsapp.media.transcode.MediaTranscodeService;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes2.dex */
public class MediaTranscodeService extends C2BL {
    public static final HashMap A08 = new HashMap();
    public C05W A01;
    public C018708s A02;
    public C00T A03;
    public C00A A04;
    public C41771uU A05;
    public String A06;
    public boolean A07 = false;
    public int A00 = -1;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    public static void A00(final Context context, C00A c00a, final C03020Dv c03020Dv) {
        c00a.A01(new C00T() { // from class: X.2GJ
            public boolean A00 = false;

            @Override // X.C00T
            public void A08(AnonymousClass092 anonymousClass092, int i) {
                HashMap hashMap = MediaTranscodeService.A08;
                synchronized (hashMap) {
                    byte b = anonymousClass092.A0m;
                    if (b == 3 || b == 13 || b == 9 || (b == 2 && anonymousClass092.A04 != 1)) {
                        if (anonymousClass092.A08 == 1) {
                            AnonymousClass094 anonymousClass094 = anonymousClass092.A0n;
                            if (!hashMap.containsKey(anonymousClass094)) {
                                hashMap.put(anonymousClass094, (AnonymousClass097) anonymousClass092);
                                Context context2 = context;
                                Intent action = new Intent(context2, MediaTranscodeService.class).setAction("com.whatsapp.media.transcode.MediaTranscodeService.START");
                                if (!c03020Dv.A00) {
                                    this.A00 = true;
                                    C02160Ac.A06(context2, action);
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("MediaTranscodeService/start-service-foreground for message:");
                                    sb.append(anonymousClass094);
                                    Log.i(sb.toString());
                                } else {
                                    try {
                                        context2.startService(action);
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append("MediaTranscodeService/start-service for message:");
                                        sb2.append(anonymousClass094);
                                        Log.i(sb2.toString());
                                    } catch (IllegalStateException unused) {
                                        this.A00 = true;
                                        C02160Ac.A06(context2, action);
                                        StringBuilder sb3 = new StringBuilder();
                                        sb3.append("MediaTranscodeService/start-service-foreground for message:");
                                        sb3.append(anonymousClass094);
                                        Log.i(sb3.toString());
                                    }
                                }
                            }
                        } else {
                            AnonymousClass097 anonymousClass097 = (AnonymousClass097) hashMap.remove(anonymousClass092.A0n);
                            if (anonymousClass097 != null && hashMap.isEmpty()) {
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append("MediaTranscodeService/stop-service for message:");
                                sb4.append(anonymousClass097.A0n);
                                Log.i(sb4.toString());
                                if (Build.VERSION.SDK_INT >= 26 && this.A00) {
                                    Context context3 = context;
                                    C02160Ac.A06(context3, new Intent(context3, MediaTranscodeService.class).setAction("com.whatsapp.media.transcode.MediaTranscodeService.STOP"));
                                } else {
                                    Context context4 = context;
                                    context4.stopService(new Intent(context4, MediaTranscodeService.class));
                                }
                                this.A00 = false;
                            }
                        }
                    }
                }
            }
        });
    }

    public final void A01() {
        int i;
        PendingIntent activity;
        String A0A;
        int i2;
        int i3;
        String A082;
        int i4;
        int i5;
        String A083;
        boolean z = this.A07;
        this.A07 = true;
        HashSet hashSet = new HashSet();
        HashMap hashMap = A08;
        if (hashMap.size() == 1) {
            AnonymousClass097 anonymousClass097 = (AnonymousClass097) hashMap.values().iterator().next();
            C05W c05w = this.A01;
            AbstractC005302j abstractC005302j = anonymousClass097.A0n.A00;
            C06C A0A2 = c05w.A0A(abstractC005302j);
            byte b = anonymousClass097.A0m;
            if (b == 2) {
                i5 = R.string.sending_audio_to_contact;
            } else if (b != 3) {
                i5 = R.string.sending_gif_to_contact;
                if (b != 13) {
                    i5 = R.string.sending_file_to_contact;
                }
            } else {
                i5 = R.string.sending_video_to_contact;
            }
            Object[] objArr = new Object[1];
            if (C003101m.A0Z(abstractC005302j)) {
                A083 = getString(R.string.my_status);
            } else {
                A083 = this.A02.A08(A0A2, false);
            }
            objArr[0] = C002701i.A0p(A083);
            A0A = getString(i5, objArr);
            C09H c09h = anonymousClass097.A02;
            if (c09h != null) {
                i2 = (int) c09h.A0C;
                if (this.A05.A09(anonymousClass097)) {
                    i2 >>= 1;
                    if (this.A05.A0A(anonymousClass097)) {
                        i2 += 50;
                    }
                }
            } else {
                i2 = -1;
            }
            Intent A00 = Conversation.A00(this, A0A2);
            C002701i.A1B(A00, "MediaTranscodeService");
            activity = PendingIntent.getActivity(this, 5, A00, 134217728);
            hashSet.add(Byte.valueOf(b));
        } else {
            HashSet hashSet2 = new HashSet();
            for (AnonymousClass092 anonymousClass092 : hashMap.values()) {
                hashSet2.add(anonymousClass092.A0n.A00);
                hashSet.add(Byte.valueOf(anonymousClass092.A0m));
            }
            if (hashSet2.size() == 1) {
                C06C A0A3 = this.A01.A0A((AbstractC005302j) hashSet2.iterator().next());
                if (hashSet.size() == 1) {
                    byte byteValue = ((Number) hashSet.iterator().next()).byteValue();
                    if (byteValue == 2) {
                        i3 = R.plurals.sending_audios_to_contact;
                    } else if (byteValue != 3) {
                        i3 = R.plurals.sending_gifs_to_contact;
                        if (byteValue != 13) {
                            i3 = R.plurals.sending_files_to_contact;
                        }
                    } else {
                        i3 = R.plurals.sending_videos_to_contact;
                    }
                } else {
                    i3 = R.plurals.sending_files_to_contact;
                }
                C002301c c002301c = ((C0IN) this).A01;
                long size = hashMap.size();
                Object[] objArr2 = new Object[2];
                objArr2[0] = Integer.valueOf(hashMap.size());
                if (C003101m.A0Z((Jid) hashSet2.iterator().next())) {
                    A082 = getString(R.string.my_status);
                } else {
                    A082 = this.A02.A08(A0A3, false);
                }
                objArr2[1] = C002701i.A0p(A082);
                A0A = c002301c.A0A(i3, size, objArr2);
                Intent A002 = Conversation.A00(this, A0A3);
                C002701i.A1B(A002, "MediaTranscodeService");
                activity = PendingIntent.getActivity(this, 5, A002, 134217728);
            } else {
                if (hashSet.size() == 1) {
                    byte byteValue2 = ((Number) hashSet.iterator().next()).byteValue();
                    if (byteValue2 == 2) {
                        i = R.plurals.sending_audios_to_contacts;
                    } else if (byteValue2 != 3) {
                        i = R.plurals.sending_gifs_to_contacts;
                        if (byteValue2 != 13) {
                            i = R.plurals.sending_files_to_contacts;
                        }
                    } else {
                        i = R.plurals.sending_videos_to_contacts;
                    }
                } else {
                    i = R.plurals.sending_files_to_contacts;
                }
                activity = PendingIntent.getActivity(this, 1, new Intent(this, HomeActivity.class), 0);
                A0A = ((C0IN) this).A01.A0A(i, hashMap.size(), Integer.valueOf(hashMap.size()));
            }
            i2 = -1;
        }
        C005402l A003 = C0DU.A00(this);
        A003.A0J = "sending_media@1";
        A003.A09 = activity;
        A02(A003, i2, A0A, z);
        if (Build.VERSION.SDK_INT >= 21) {
            if (hashSet.size() == 1) {
                byte byteValue3 = ((Number) hashSet.iterator().next()).byteValue();
                if (byteValue3 == 2) {
                    i4 = R.plurals.sending_audios_to_contacts;
                } else if (byteValue3 != 3) {
                    i4 = R.plurals.sending_gifs_to_contacts;
                    if (byteValue3 != 13) {
                        i4 = R.plurals.sending_files_to_contacts;
                    }
                } else {
                    i4 = R.plurals.sending_videos_to_contacts;
                }
            } else {
                i4 = R.plurals.sending_files_to_contacts;
            }
            String A0A4 = ((C0IN) this).A01.A0A(i4, hashMap.size(), Integer.valueOf(hashMap.size()));
            C005402l A004 = C0DU.A00(this);
            A004.A0J = "sending_media@1";
            A02(A004, i2, A0A4, z);
            A003.A08 = A004.A01();
        }
        Notification A01 = A003.A01();
        if (!z || this.A00 != i2 || !TextUtils.equals(A0A, this.A06)) {
            startForeground(3, A01);
        }
        this.A00 = i2;
        this.A06 = A0A;
    }

    public final void A02(C005402l c005402l, int i, String str, boolean z) {
        c005402l.A0I = "progress";
        c005402l.A07.when = System.currentTimeMillis();
        c005402l.A0A(getString(R.string.app_name));
        c005402l.A09(str);
        if (i >= 0) {
            boolean z2 = i == 0;
            c005402l.A05 = 100;
            c005402l.A04 = i;
            c005402l.A0T = z2;
        }
        if (!z) {
            c005402l.A07.tickerText = C005402l.A00(str);
        }
        c005402l.A07.icon = 17301640;
    }

    @Override // X.C2BL, android.app.Service
    public void onCreate() {
        Log.i("MediaTranscodeService/onCreate");
        super.onCreate();
        C00T c00t = new C00T() { // from class: X.2GK
            {
                MediaTranscodeService.this = this;
            }

            @Override // X.C00T
            public void A08(AnonymousClass092 anonymousClass092, int i) {
                if (MediaTranscodeService.A08.containsKey(anonymousClass092.A0n)) {
                    MediaTranscodeService.this.A01();
                }
            }
        };
        this.A03 = c00t;
        this.A04.A01(c00t);
    }

    @Override // android.app.Service
    public void onDestroy() {
        A08.size();
        this.A07 = false;
        stopForeground(true);
        this.A04.A00(this.A03);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent != null && "com.whatsapp.media.transcode.MediaTranscodeService.STOP".equals(intent.getAction())) {
            if (Build.VERSION.SDK_INT >= 26) {
                C005402l A00 = C0DU.A00(this);
                A00.A0J = "sending_media@1";
                A00.A0A(getString(R.string.app_name));
                A00.A09(getString(R.string.sending_message));
                A00.A03 = -1;
                A00.A07.icon = 17301640;
                startForeground(3, A00.A01());
            }
            this.A07 = false;
            C000200d.A1C("MediaTranscodeService/stopService success:", stopSelfResult(i2));
            return 2;
        }
        A01();
        return 2;
    }
}
