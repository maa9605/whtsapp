package java.lang;

import X.AbstractC005302j;
import X.AnonymousClass092;
import X.AnonymousClass094;
import X.AnonymousClass095;
import X.AnonymousClass097;
import X.AnonymousClass316;
import X.C000200d;
import X.C002701i;
import X.C003101m;
import X.C02180Ae;
import X.C03790Hb;
import X.C05A;
import X.C05C;
import X.C09D;
import X.C09H;
import X.C0CD;
import X.C0CE;
import X.C0DB;
import X.C0DD;
import X.C0DH;
import X.C0EB;
import X.C0Hr;
import X.C0IT;
import X.C0J5;
import X.C22X;
import X.C2AL;
import X.C41181tV;
import X.C43081wp;
import X.C43911yC;
import X.C44001yM;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;
import com.whatsapp.jid.UserJid;
import com.whatsapp.mediaview.MediaViewFragment;
import com.whatsapp.mediaview.PhotoView;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.Stack;

/* loaded from: classes2.dex */
public class RunnableEBaseShape0S0310000_I0 extends RunnableEmptyBase implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public boolean A03;
    public final int A04;

    public RunnableEBaseShape0S0310000_I0(MediaViewFragment mediaViewFragment) {
        this.A04 = 3;
        this.A01 = mediaViewFragment;
        this.A00 = new Stack();
        this.A02 = new Thread(this, "PhotoLoader");
    }

    public RunnableEBaseShape0S0310000_I0(Object obj, boolean z, Object obj2, Object obj3, int i) {
        this.A04 = i;
        this.A00 = obj;
        this.A03 = z;
        this.A01 = obj2;
        this.A02 = obj3;
    }

    public void A00(AnonymousClass097 anonymousClass097, PhotoView photoView) {
        AnonymousClass316 anonymousClass316 = new AnonymousClass316(anonymousClass097, photoView);
        AbstractList abstractList = (AbstractList) this.A00;
        synchronized (abstractList) {
            abstractList.add(0, anonymousClass316);
            abstractList.notifyAll();
        }
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() {
        MediaViewFragment mediaViewFragment;
        boolean A06;
        AnonymousClass316 anonymousClass316;
        Bitmap bitmap;
        int i;
        Set emptySet;
        C0CD A04;
        AnonymousClass092 anonymousClass092;
        C03790Hb A00;
        switch (this.A04) {
            case 0:
                C41181tV c41181tV = (C41181tV) this.A00;
                boolean z = this.A03;
                AbstractC005302j abstractC005302j = (AbstractC005302j) this.A01;
                C0IT c0it = (C0IT) this.A02;
                if (z) {
                    emptySet = c41181tV.A02.A0H(abstractC005302j, false);
                } else {
                    emptySet = Collections.emptySet();
                }
                C05A c05a = c41181tV.A06;
                try {
                    A04 = c05a.A04.A04();
                } catch (SQLiteDatabaseCorruptException e) {
                    Log.e(e);
                    c05a.A03.A03();
                } catch (Error e2) {
                    e = e2;
                    Log.e(e);
                    throw e;
                } catch (RuntimeException e3) {
                    e = e3;
                    Log.e(e);
                    throw e;
                }
                try {
                    C03790Hb A002 = A04.A00();
                    if (!c05a.A0G()) {
                        ContentValues A0B = c0it.A0B();
                        AbstractC005302j abstractC005302j2 = c0it.A0U;
                        int A02 = c05a.A02(A0B, abstractC005302j2);
                        StringBuilder sb = new StringBuilder();
                        sb.append("msgstore/setchatunseen/");
                        sb.append(abstractC005302j2);
                        sb.append("/");
                        sb.append(c0it.A0H());
                        sb.append("/");
                        sb.append(A02);
                        Log.i(sb.toString());
                    } else {
                        ContentValues A0B2 = c0it.A0B();
                        AbstractC005302j abstractC005302j3 = c0it.A0U;
                        int A01 = c05a.A01(A0B2, abstractC005302j3);
                        if (A01 > 0) {
                            c05a.A02(c0it.A0B(), abstractC005302j3);
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("msgstore/setchatunseen/");
                        sb2.append(abstractC005302j3);
                        sb2.append("/");
                        sb2.append(c0it.A0H());
                        sb2.append("/");
                        sb2.append(A01);
                        Log.i(sb2.toString());
                    }
                    A002.A00();
                    A002.close();
                    A04.close();
                    c41181tV.A02.A0V(emptySet);
                    c41181tV.A09.A02.post(new RunnableEBaseShape1S0200000_I0_1(c41181tV, abstractC005302j, 35));
                    return;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } finally {
                        try {
                            A04.close();
                        } catch (Throwable unused) {
                        }
                    }
                }
            case 1:
                ((C43081wp) this.A00).A0A.A07((Collection) this.A01, null, (HashMap) this.A02, this.A03);
                return;
            case 2:
                ((C43911yC) this.A00).A05((C44001yM) this.A01, this.A03, (C0J5) this.A02);
                return;
            case 3:
                try {
                    mediaViewFragment = (MediaViewFragment) this.A01;
                    A06 = mediaViewFragment.A0W.A06();
                } catch (InterruptedException unused2) {
                }
                while (!this.A03) {
                    Stack stack = (Stack) this.A00;
                    if (stack.size() == 0) {
                        synchronized (stack) {
                            stack.wait();
                        }
                    }
                    if (!this.A03) {
                        if (stack.size() != 0) {
                            synchronized (stack) {
                                anonymousClass316 = (AnonymousClass316) stack.pop();
                            }
                            AnonymousClass097 anonymousClass097 = anonymousClass316.A01;
                            C09H c09h = anonymousClass097.A02;
                            if (c09h != null) {
                                File file = c09h.A0F;
                                if (file != null && A06) {
                                    if (!(anonymousClass097 instanceof AnonymousClass095) && !(anonymousClass097 instanceof C09D)) {
                                        if (C0DB.A0D(anonymousClass097.A0m)) {
                                            try {
                                                bitmap = C02180Ae.A0I(file);
                                                if (bitmap == null) {
                                                    try {
                                                        Log.w("mediaview/fillview/bitmap/null");
                                                    } catch (OutOfMemoryError e4) {
                                                        e = e4;
                                                        Log.e("mediaview/oom", e);
                                                        if (mediaViewFragment != null) {
                                                            System.gc();
                                                            mediaViewFragment.A0E.A02.post(new RunnableEBaseShape2S0300000_I1(anonymousClass316, this, null, 5));
                                                        } else {
                                                            throw null;
                                                        }
                                                    }
                                                } else {
                                                    mediaViewFragment.A0E.A02.post(new RunnableEBaseShape2S0300000_I1(anonymousClass316, this, bitmap, 5));
                                                }
                                            } catch (OutOfMemoryError e5) {
                                                e = e5;
                                            }
                                        }
                                        mediaViewFragment.A0E.A02.post(new RunnableEBaseShape2S0300000_I1(anonymousClass316, this, null, 5));
                                    } else {
                                        PhotoView photoView = anonymousClass316.A00;
                                        int width = photoView.getWidth();
                                        int height = photoView.getHeight();
                                        if (width == 0 || height == 0) {
                                            WindowManager windowManager = (WindowManager) mediaViewFragment.A00().getSystemService("window");
                                            if (windowManager != null) {
                                                Display defaultDisplay = windowManager.getDefaultDisplay();
                                                Point point = new Point();
                                                defaultDisplay.getSize(point);
                                                width = point.x;
                                                height = point.y;
                                            } else {
                                                throw null;
                                            }
                                        }
                                        bitmap = C002701i.A0L(c09h.A0F, new C0DH(Integer.MAX_VALUE, Integer.MAX_VALUE, Long.valueOf((width * height) << 2), false, null)).A02;
                                        try {
                                            i = C0DD.A04(c09h.A0F.getAbsolutePath());
                                        } catch (IOException e6) {
                                            Log.e("mediaview/getExif", e6);
                                            i = 1;
                                        }
                                        if (bitmap != null) {
                                            if (i != 1) {
                                                bitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), C0DD.A09(i), true);
                                            }
                                            mediaViewFragment.A0E.A02.post(new RunnableEBaseShape2S0300000_I1(anonymousClass316, this, bitmap, 5));
                                        } else {
                                            mediaViewFragment.A0E.A02.post(new RunnableEBaseShape2S0300000_I1(anonymousClass316, this, null, 5));
                                        }
                                    }
                                } else {
                                    mediaViewFragment.A0E.A02.post(new RunnableEBaseShape2S0300000_I1(anonymousClass316, this, null, 5));
                                }
                            } else {
                                throw null;
                            }
                        }
                    } else {
                        ((AbstractCollection) this.A00).clear();
                        return;
                    }
                }
                ((AbstractCollection) this.A00).clear();
                return;
            case 4:
                C2AL c2al = (C2AL) this.A00;
                List<AnonymousClass092> list = (List) this.A01;
                AnonymousClass092 anonymousClass0922 = (AnonymousClass092) this.A02;
                boolean z2 = this.A03;
                int i2 = 0;
                for (AnonymousClass092 anonymousClass0923 : list) {
                    if (anonymousClass0923.A0p <= anonymousClass0922.A0p) {
                        C0EB c0eb = c2al.A03;
                        if (c0eb.A0K(anonymousClass0923)) {
                            int i3 = i2 + 1;
                            AnonymousClass092 anonymousClass0924 = i3 < list.size() ? (AnonymousClass092) list.get(i3) : null;
                            if (i3 < list.size()) {
                                anonymousClass092 = (AnonymousClass092) list.get(Math.min(list.size() - 1, i2 + 2));
                            } else {
                                anonymousClass092 = null;
                            }
                            boolean A0m = c2al.A00.A0m();
                            if (A0m) {
                                StringBuilder A0P = C000200d.A0P("statusmanager/markstatusasseen/sending status rr for ");
                                A0P.append(anonymousClass0923.A0n);
                                A0P.append(" ");
                                A0P.append(anonymousClass0923.A0A());
                                A0P.append(" ");
                                C000200d.A1F(A0P, anonymousClass0923.A0m);
                                c2al.A04.A04(anonymousClass0923, false);
                            }
                            StringBuilder A0P2 = C000200d.A0P("statusmanager/markstatusasseen/mark seen ");
                            AnonymousClass094 anonymousClass094 = anonymousClass0923.A0n;
                            A0P2.append(anonymousClass094);
                            A0P2.append(" ");
                            A0P2.append(anonymousClass0923.A0A());
                            A0P2.append(" ");
                            byte b = anonymousClass0923.A0m;
                            C000200d.A1F(A0P2, b);
                            C0Hr A07 = c0eb.A07(UserJid.of(anonymousClass0923.A0A()));
                            if (A07 == null) {
                                StringBuilder A0P3 = C000200d.A0P("statusmanager/markstatusasseen/no status for ");
                                A0P3.append(anonymousClass0923.A0A());
                                Log.w(A0P3.toString());
                            } else {
                                synchronized (A07) {
                                    if (anonymousClass0923.A0p > A07.A04) {
                                        if (A0m) {
                                            A07.A05 = anonymousClass0923.A0p;
                                        }
                                        A07.A04 = anonymousClass0923.A0p;
                                        int i4 = A07.A01;
                                        if (i4 > 0) {
                                            A07.A01 = i4 - 1;
                                        }
                                        A07.A03 = anonymousClass0924 == null ? 1L : anonymousClass0924.A0p;
                                        A07.A02 = anonymousClass092 != null ? anonymousClass092.A0p : 1L;
                                        C0Hr.A00(anonymousClass0923);
                                        C0Hr A012 = A07.A01();
                                        if (A012 != null) {
                                            C22X c22x = c2al.A02;
                                            if (c22x != null) {
                                                StringBuilder A0P4 = C000200d.A0P("msgstore/setstatusreadreceiptssent/");
                                                A0P4.append(anonymousClass0923.A0A());
                                                A0P4.append(" rrsent=");
                                                A0P4.append(A0m);
                                                Log.i(A0P4.toString());
                                                A04 = c22x.A0C.A04();
                                                try {
                                                    try {
                                                        A00 = A04.A00();
                                                    } catch (SQLiteDatabaseCorruptException e7) {
                                                        Log.e(e7);
                                                        c22x.A0B.A03();
                                                    } catch (Error e8) {
                                                        e = e8;
                                                        Log.e(e);
                                                        throw e;
                                                    } catch (RuntimeException e9) {
                                                        e = e9;
                                                        Log.e(e);
                                                        throw e;
                                                    }
                                                    try {
                                                        C0EB c0eb2 = c22x.A0E;
                                                        long j = anonymousClass0923.A0p;
                                                        int i5 = A012.A01;
                                                        long j2 = A012.A03;
                                                        long j3 = A012.A02;
                                                        String A072 = C003101m.A07(anonymousClass0923.A0A());
                                                        C0CD A042 = c0eb2.A02.A04();
                                                        boolean A0I = c0eb2.A0I();
                                                        ContentValues contentValues = new ContentValues();
                                                        if (A0m) {
                                                            contentValues.put("last_read_receipt_sent_message_table_id", Long.valueOf(j));
                                                        }
                                                        contentValues.put("last_read_message_table_id", Long.valueOf(j));
                                                        contentValues.put("unseen_count", Integer.valueOf(i5));
                                                        contentValues.put("first_unread_message_table_id", Long.valueOf(j2));
                                                        contentValues.put("autodownload_limit_message_table_id", Long.valueOf(j3));
                                                        C0CE c0ce = A042.A02;
                                                        String str = A0I ? "status_list" : "status";
                                                        String str2 = A0I ? "key_remote_jid=?" : "jid_row_id=?";
                                                        String[] A0L = c0eb2.A0L(A0I, UserJid.getNullable(A072));
                                                        C0EB.A01("updateStatus/UPDATE", A0I);
                                                        if (c0ce.A00(str, contentValues, str2, A0L) == 0) {
                                                            StringBuilder sb3 = new StringBuilder();
                                                            sb3.append("msgstore/setstatusreadreceiptssent/no status saved for ");
                                                            sb3.append(A072);
                                                            sb3.append("; shouldUseDeprecatedTable=");
                                                            sb3.append(A0I);
                                                            Log.e(sb3.toString());
                                                        }
                                                        A042.close();
                                                        if (C003101m.A0Y(anonymousClass0923.A0A())) {
                                                            C05C c05c = c22x.A0D;
                                                            String A022 = c05c.A02("status_psa_viewed_time");
                                                            long parseLong = A022 != null ? Long.parseLong(A022) : 0L;
                                                            long j4 = anonymousClass0923.A0E;
                                                            if (j4 >= parseLong) {
                                                                c05c.A05("status_psa_viewed_time", j4 + 10000);
                                                                c05c.A05("status_psa_exipration_time", c22x.A01.A05() + 86400000);
                                                            }
                                                        }
                                                        A00.A00();
                                                        A00.close();
                                                        c22x.A06.A02.post(new RunnableEBaseShape1S0200000_I0_1(c22x, anonymousClass0923, 48));
                                                        A04.close();
                                                        if (z2) {
                                                            StringBuilder A0P5 = C000200d.A0P("statusmanager/markstatusasseen did set web status seen ");
                                                            A0P5.append(anonymousClass094);
                                                            A0P5.append(" ");
                                                            A0P5.append(anonymousClass0923.A0A());
                                                            A0P5.append(" ");
                                                            C000200d.A1F(A0P5, b);
                                                            c2al.A06.A0C(anonymousClass0923, C0EB.A02(c0eb.A08()));
                                                        }
                                                    } catch (Throwable th2) {
                                                        try {
                                                            throw th2;
                                                            break;
                                                        } catch (Throwable th3) {
                                                            try {
                                                                A00.close();
                                                            } catch (Throwable unused3) {
                                                            }
                                                            throw th3;
                                                            break;
                                                        }
                                                    }
                                                } catch (Throwable th4) {
                                                    try {
                                                        throw th4;
                                                    } catch (Throwable th5) {
                                                        throw th5;
                                                    }
                                                }
                                            } else {
                                                throw null;
                                            }
                                        }
                                    }
                                }
                                Log.w("statusmanager/markstatusasseen/updatestatus returned null");
                            }
                        } else {
                            continue;
                        }
                    }
                    i2++;
                }
                return;
            default:
                return;
        }
    }
}
