package X;

import android.database.Cursor;
import android.os.SystemClock;
import android.text.TextUtils;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.092 */
/* loaded from: classes.dex */
public abstract class AnonymousClass092 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public long A0B;
    public long A0C;
    public long A0D;
    public long A0E;
    public AnonymousClass093 A0F;
    public AbstractC005302j A0G;
    public C0CZ A0H;
    public AnonymousClass094 A0I;
    public EnumC03920Hs A0J;
    public AnonymousClass092 A0K;
    public C05520Pb A0L;
    public C03900Hp A0M;
    public C05610Pk A0N;
    public C05200Ns A0O;
    public Integer A0P;
    public Long A0Q;
    public Long A0R;
    public Long A0S;
    public Long A0T;
    public Long A0U;
    public String A0V;
    public String A0W;
    public String A0X;
    public String A0Y;
    public String A0Z;
    public String A0a;
    public String A0b;
    public List A0c;
    public List A0d;
    public Map A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public byte[] A0l;
    public final byte A0m;
    public final AnonymousClass094 A0n;
    public final Object A0o;
    public volatile long A0p;
    public volatile long A0q;
    public volatile boolean A0r;
    public transient long A0s;
    public transient long A0t;
    public transient long A0u;
    public transient DeviceJid A0v;
    public transient boolean A0w;
    public transient boolean A0x;
    public final transient long A0y;
    public volatile transient int A0z;

    public double A01() {
        return 0.0d;
    }

    public double A02() {
        return 0.0d;
    }

    public int A04() {
        return 0;
    }

    public int A05() {
        return 0;
    }

    public long A08() {
        return 0L;
    }

    public Object A0F() {
        return null;
    }

    public String A0H() {
        return null;
    }

    public String A0J() {
        return null;
    }

    public String A0K() {
        return null;
    }

    public String A0L() {
        return null;
    }

    public String A0M() {
        return null;
    }

    public String A0N() {
        return null;
    }

    public String A0O() {
        return null;
    }

    public void A0S(double d) {
    }

    public void A0T(double d) {
    }

    public void A0W(int i) {
    }

    public void A0X(int i) {
    }

    public void A0a(long j) {
    }

    public void A0k(Object obj) {
    }

    public void A0o(String str) {
    }

    public void A0p(String str) {
    }

    public void A0q(String str) {
    }

    public void A0r(String str) {
    }

    public void A0s(String str) {
    }

    public void A0t(String str) {
    }

    public boolean A0x() {
        return true;
    }

    public boolean A0y() {
        return true;
    }

    public boolean A13() {
        return true;
    }

    public abstract String A16();

    public abstract void A17(String str);

    public AnonymousClass092(AnonymousClass092 anonymousClass092, AnonymousClass094 anonymousClass094, long j, boolean z) {
        this(anonymousClass092, anonymousClass094, j, z, anonymousClass092.A0m);
    }

    public AnonymousClass092(AnonymousClass092 anonymousClass092, AnonymousClass094 anonymousClass094, long j, boolean z, byte b) {
        this(anonymousClass094, j, b);
        ArrayList arrayList;
        AnonymousClass093 anonymousClass093;
        synchronized (anonymousClass092.A0o) {
            this.A0X = anonymousClass092.A0X;
            this.A0l = anonymousClass092.A0l;
        }
        this.A01 = anonymousClass092.A01;
        this.A04 = anonymousClass092.A04;
        A0v(anonymousClass092.A0c);
        this.A0I = anonymousClass092.A0I;
        if (z) {
            this.A0G = anonymousClass092.A0A();
            this.A0v = anonymousClass092.A0v;
            if (anonymousClass092.A0P() != null) {
                arrayList = new ArrayList(anonymousClass092.A0P());
            } else {
                arrayList = null;
            }
            this.A0d = arrayList;
            this.A0a = anonymousClass092.A0a;
            this.A0Z = anonymousClass092.A0Z;
            this.A0f = anonymousClass092.A0f;
            this.A06 = anonymousClass092.A06;
            this.A0J = anonymousClass092.A0J;
            this.A0P = anonymousClass092.A0P;
            this.A0B = anonymousClass092.A0B;
            this.A0K = anonymousClass092.A0K;
            this.A0U = anonymousClass092.A0U;
            this.A0A = anonymousClass092.A0A;
            this.A0O = anonymousClass092.A0O;
            this.A0T = anonymousClass092.A0T;
            this.A0S = anonymousClass092.A0S;
            this.A00 = anonymousClass092.A00;
            this.A05 = anonymousClass092.A05;
            this.A03 = anonymousClass092.A03;
            A00(anonymousClass092, this, false);
            AnonymousClass093 anonymousClass0932 = anonymousClass092.A0F;
            if (anonymousClass0932 != null && (anonymousClass093 = this.A0F) != null) {
                synchronized (anonymousClass0932) {
                    if (TextUtils.isEmpty(anonymousClass093.A0I) || anonymousClass093.A0I.equals(anonymousClass0932.A0I)) {
                        anonymousClass093.A0I = anonymousClass0932.A0I;
                        anonymousClass093.A01 = anonymousClass0932.A01;
                        anonymousClass093.A05 = anonymousClass0932.A05;
                    }
                }
            }
        }
    }

    public AnonymousClass092(AnonymousClass094 anonymousClass094, long j, byte b) {
        this.A0w = false;
        this.A0x = false;
        this.A0D = -1L;
        this.A0J = EnumC03920Hs.NONE;
        this.A0p = -1L;
        this.A0q = -1L;
        this.A0P = null;
        this.A0Y = null;
        this.A09 = 0;
        this.A0o = new Object();
        if (anonymousClass094 != null) {
            this.A0n = anonymousClass094;
            this.A0E = j;
            this.A0m = b;
            long uptimeMillis = SystemClock.uptimeMillis();
            this.A0y = uptimeMillis;
            this.A0u = uptimeMillis;
            return;
        }
        throw null;
    }

    public static void A00(AnonymousClass092 anonymousClass092, AnonymousClass092 anonymousClass0922, boolean z) {
        AnonymousClass092 anonymousClass0923;
        if (anonymousClass092.A0E() != null && anonymousClass0922.A0E() != null && anonymousClass092.A0E().A06() && anonymousClass092.A0E().A08() != null) {
            anonymousClass0922.A0E().A04(anonymousClass092.A0E().A08(), z);
        }
        AnonymousClass092 anonymousClass0924 = anonymousClass092.A0K;
        if (anonymousClass0924 == null || (anonymousClass0923 = anonymousClass0922.A0K) == null) {
            return;
        }
        A00(anonymousClass0924, anonymousClass0923, true);
    }

    public int A03() {
        int i;
        synchronized (this.A0o) {
            i = this.A01;
        }
        return i;
    }

    public int A06() {
        return this.A0m;
    }

    public int A07() {
        if (TextUtils.isEmpty(A0H())) {
            this.A05 = (64 ^ (-1)) & this.A05;
        }
        return this.A05;
    }

    public long A09() {
        long j = A12() ? 1L : 0L;
        if (this.A0K != null || this.A0B > 0) {
            j |= 2;
        }
        if (this.A0b != null) {
            j |= 4;
        }
        return A11() ? j | 8 : j;
    }

    public AbstractC005302j A0A() {
        return this.A0G;
    }

    public UserJid A0B() {
        AbstractC005302j abstractC005302j = this.A0n.A00;
        if (C003101m.A0U(abstractC005302j) || C003101m.A0P(abstractC005302j)) {
            abstractC005302j = this.A0G;
        }
        return (UserJid) abstractC005302j;
    }

    public AnonymousClass092 A0C() {
        if (A0y()) {
            return this.A0K;
        }
        return null;
    }

    public C05520Pb A0D() {
        C05520Pb c05520Pb = this.A0L;
        if (c05520Pb == null) {
            C05520Pb c05520Pb2 = new C05520Pb();
            this.A0L = c05520Pb2;
            return c05520Pb2;
        }
        return c05520Pb;
    }

    public C03900Hp A0E() {
        C03900Hp c03900Hp;
        synchronized (this.A0o) {
            c03900Hp = this.A0M;
            if (c03900Hp == null && C03900Hp.A01(this.A0m)) {
                c03900Hp = new C03900Hp(this);
                this.A0M = c03900Hp;
            }
        }
        return c03900Hp;
    }

    public String A0G() {
        byte[] bArr;
        synchronized (this.A0o) {
            if (this.A01 == 1) {
                return null;
            }
            String str = this.A0X;
            if (str == null && (bArr = this.A0l) != null) {
                str = C02590Ca.A00(bArr);
                this.A0X = str;
            }
            return str;
        }
    }

    public String A0I() {
        List list = this.A0d;
        if (list != null) {
            return TextUtils.join(",", C003101m.A0d(list));
        }
        return C003101m.A07(this.A0G);
    }

    public List A0P() {
        return this.A0d;
    }

    public void A0Q() {
        this.A08 = 0;
    }

    public void A0R() {
        List list = this.A0d;
        if (list != null) {
            Collections.sort(list);
        }
    }

    public void A0U(int i) {
        this.A05 = i | this.A05;
    }

    public void A0V(int i) {
        if (i <= 0) {
            this.A02 = 0;
            this.A05 = (256 ^ (-1)) & this.A05;
            return;
        }
        this.A02 = i;
        A0U(256);
    }

    public void A0Y(int i) {
        if (C0D6.A00(this.A08, i) > 0) {
            StringBuilder A0P = C000200d.A0P("FMessage/setStatus/statusDowngrade/key=");
            A0P.append(this.A0n);
            A0P.append("; type=");
            A0P.append((int) this.A0m);
            A0P.append("; current=");
            A0P.append(this.A08);
            A0P.append("; new=");
            A0P.append(i);
            String obj = A0P.toString();
            Log.e(obj);
            C000700j.A08(false, obj);
        }
        this.A08 = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0005, code lost:
        if (r3 == r5) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0Z(int r5) {
        /*
            r4 = this;
            int r3 = r4.A09
            if (r3 == 0) goto L7
            r2 = 0
            if (r3 != r5) goto L8
        L7:
            r2 = 1
        L8:
            java.lang.String r0 = "FMessage/setStorageType/should only update storage type when it is undefined; current="
            java.lang.StringBuilder r1 = X.C000200d.A0P(r0)
            r1.append(r3)
            java.lang.String r0 = "; new="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = r1.toString()
            X.C000700j.A08(r2, r0)
            r4.A09 = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass092.A0Z(int):void");
    }

    public void A0b(Cursor cursor) {
        Object obj;
        byte[] blob = cursor.getBlob(cursor.getColumnIndexOrThrow("thumb_image"));
        if (blob != null) {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(blob));
                try {
                    obj = objectInputStream.readObject();
                    try {
                        objectInputStream.close();
                    } catch (IOException e) {
                        e = e;
                        Log.e("MessageStoreMessageUtils/readMessageFromCursor", e);
                        A0t(cursor.getString(cursor.getColumnIndexOrThrow("media_url")));
                        A0r(cursor.getString(cursor.getColumnIndexOrThrow("media_mime_type")));
                        A0a(cursor.getLong(cursor.getColumnIndexOrThrow("media_size")));
                        A0s(cursor.getString(cursor.getColumnIndexOrThrow("media_name")));
                        A0o(cursor.getString(cursor.getColumnIndexOrThrow("media_caption")));
                        A0q(cursor.getString(cursor.getColumnIndexOrThrow("media_hash")));
                        A0p(cursor.getString(cursor.getColumnIndexOrThrow("media_enc_hash")));
                        A0W(cursor.getInt(cursor.getColumnIndexOrThrow("media_duration")));
                        A0S(cursor.getDouble(cursor.getColumnIndexOrThrow("latitude")));
                        A0T(cursor.getDouble(cursor.getColumnIndexOrThrow("longitude")));
                        this.A0B = cursor.getLong(cursor.getColumnIndexOrThrow("quoted_row_id"));
                        A0m(cursor.getString(cursor.getColumnIndexOrThrow("multicast_id")));
                        this.A00 = cursor.getInt(cursor.getColumnIndexOrThrow("edit_version"));
                        A0v(AnonymousClass029.A0y(cursor.getString(cursor.getColumnIndexOrThrow("mentioned_jids"))));
                        this.A0b = cursor.getString(cursor.getColumnIndexOrThrow("payment_transaction_id"));
                        A0X(cursor.getInt(cursor.getColumnIndexOrThrow("preview_type")));
                        A0k(obj);
                        this.A0v = null;
                    } catch (ArrayIndexOutOfBoundsException e2) {
                        e = e2;
                        Log.e("MessageStoreMessageUtils/readMessageFromCursor", e);
                        A0t(cursor.getString(cursor.getColumnIndexOrThrow("media_url")));
                        A0r(cursor.getString(cursor.getColumnIndexOrThrow("media_mime_type")));
                        A0a(cursor.getLong(cursor.getColumnIndexOrThrow("media_size")));
                        A0s(cursor.getString(cursor.getColumnIndexOrThrow("media_name")));
                        A0o(cursor.getString(cursor.getColumnIndexOrThrow("media_caption")));
                        A0q(cursor.getString(cursor.getColumnIndexOrThrow("media_hash")));
                        A0p(cursor.getString(cursor.getColumnIndexOrThrow("media_enc_hash")));
                        A0W(cursor.getInt(cursor.getColumnIndexOrThrow("media_duration")));
                        A0S(cursor.getDouble(cursor.getColumnIndexOrThrow("latitude")));
                        A0T(cursor.getDouble(cursor.getColumnIndexOrThrow("longitude")));
                        this.A0B = cursor.getLong(cursor.getColumnIndexOrThrow("quoted_row_id"));
                        A0m(cursor.getString(cursor.getColumnIndexOrThrow("multicast_id")));
                        this.A00 = cursor.getInt(cursor.getColumnIndexOrThrow("edit_version"));
                        A0v(AnonymousClass029.A0y(cursor.getString(cursor.getColumnIndexOrThrow("mentioned_jids"))));
                        this.A0b = cursor.getString(cursor.getColumnIndexOrThrow("payment_transaction_id"));
                        A0X(cursor.getInt(cursor.getColumnIndexOrThrow("preview_type")));
                        A0k(obj);
                        this.A0v = null;
                    } catch (ClassNotFoundException e3) {
                        e = e3;
                        Log.e("MessageStoreMessageUtils/readMessageFromCursor", e);
                        A0t(cursor.getString(cursor.getColumnIndexOrThrow("media_url")));
                        A0r(cursor.getString(cursor.getColumnIndexOrThrow("media_mime_type")));
                        A0a(cursor.getLong(cursor.getColumnIndexOrThrow("media_size")));
                        A0s(cursor.getString(cursor.getColumnIndexOrThrow("media_name")));
                        A0o(cursor.getString(cursor.getColumnIndexOrThrow("media_caption")));
                        A0q(cursor.getString(cursor.getColumnIndexOrThrow("media_hash")));
                        A0p(cursor.getString(cursor.getColumnIndexOrThrow("media_enc_hash")));
                        A0W(cursor.getInt(cursor.getColumnIndexOrThrow("media_duration")));
                        A0S(cursor.getDouble(cursor.getColumnIndexOrThrow("latitude")));
                        A0T(cursor.getDouble(cursor.getColumnIndexOrThrow("longitude")));
                        this.A0B = cursor.getLong(cursor.getColumnIndexOrThrow("quoted_row_id"));
                        A0m(cursor.getString(cursor.getColumnIndexOrThrow("multicast_id")));
                        this.A00 = cursor.getInt(cursor.getColumnIndexOrThrow("edit_version"));
                        A0v(AnonymousClass029.A0y(cursor.getString(cursor.getColumnIndexOrThrow("mentioned_jids"))));
                        this.A0b = cursor.getString(cursor.getColumnIndexOrThrow("payment_transaction_id"));
                        A0X(cursor.getInt(cursor.getColumnIndexOrThrow("preview_type")));
                        A0k(obj);
                        this.A0v = null;
                    }
                } finally {
                }
            } catch (IOException | ArrayIndexOutOfBoundsException | ClassNotFoundException e4) {
                e = e4;
                obj = null;
            }
        } else {
            obj = null;
        }
        A0t(cursor.getString(cursor.getColumnIndexOrThrow("media_url")));
        A0r(cursor.getString(cursor.getColumnIndexOrThrow("media_mime_type")));
        A0a(cursor.getLong(cursor.getColumnIndexOrThrow("media_size")));
        A0s(cursor.getString(cursor.getColumnIndexOrThrow("media_name")));
        A0o(cursor.getString(cursor.getColumnIndexOrThrow("media_caption")));
        A0q(cursor.getString(cursor.getColumnIndexOrThrow("media_hash")));
        A0p(cursor.getString(cursor.getColumnIndexOrThrow("media_enc_hash")));
        A0W(cursor.getInt(cursor.getColumnIndexOrThrow("media_duration")));
        A0S(cursor.getDouble(cursor.getColumnIndexOrThrow("latitude")));
        A0T(cursor.getDouble(cursor.getColumnIndexOrThrow("longitude")));
        this.A0B = cursor.getLong(cursor.getColumnIndexOrThrow("quoted_row_id"));
        A0m(cursor.getString(cursor.getColumnIndexOrThrow("multicast_id")));
        this.A00 = cursor.getInt(cursor.getColumnIndexOrThrow("edit_version"));
        A0v(AnonymousClass029.A0y(cursor.getString(cursor.getColumnIndexOrThrow("mentioned_jids"))));
        this.A0b = cursor.getString(cursor.getColumnIndexOrThrow("payment_transaction_id"));
        A0X(cursor.getInt(cursor.getColumnIndexOrThrow("preview_type")));
        A0k(obj);
        this.A0v = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:202:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0237  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0c(X.C05B r8, android.database.Cursor r9) {
        /*
            Method dump skipped, instructions count: 969
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass092.A0c(X.05B, android.database.Cursor):void");
    }

    public void A0d(AbstractC005302j abstractC005302j) {
        this.A0G = abstractC005302j;
        this.A0d = null;
    }

    public void A0e(C0CZ c0cz) {
        this.A0H = c0cz;
        if (c0cz != null) {
            A0U(1024);
            return;
        }
        this.A05 = (1024 ^ (-1)) & this.A05;
    }

    public void A0f(AnonymousClass092 anonymousClass092) {
        ArrayList arrayList;
        this.A0p = anonymousClass092.A0p;
        this.A0q = anonymousClass092.A0q;
        this.A0E = anonymousClass092.A0E;
        this.A0C = anonymousClass092.A0C;
        this.A0G = anonymousClass092.A0A();
        this.A0v = anonymousClass092.A0v;
        if (anonymousClass092.A0P() != null) {
            arrayList = new ArrayList(anonymousClass092.A0P());
        } else {
            arrayList = null;
        }
        this.A0d = arrayList;
        this.A0D = anonymousClass092.A0D;
        this.A0g = anonymousClass092.A0g;
        this.A0r = anonymousClass092.A0r;
        AnonymousClass093 anonymousClass093 = anonymousClass092.A0F;
        if (anonymousClass093 != null && (this.A0F == null || anonymousClass093.A02 != 4)) {
            this.A0b = anonymousClass092.A0b;
            this.A0F = anonymousClass093;
        }
        if (anonymousClass092.A10()) {
            this.A02 = anonymousClass092.A02;
            this.A0R = anonymousClass092.A0R;
        }
    }

    public void A0g(AnonymousClass092 anonymousClass092) {
        if (anonymousClass092 != null) {
            if (!A0y()) {
                C000700j.A08(false, "message type is not allowed to have a quoted message");
                return;
            } else if (!anonymousClass092.A0x()) {
                C000700j.A08(false, "message type can not be a quoted message");
                return;
            } else {
                C000700j.A08(anonymousClass092.A09 == 2, "quoted message should be marked StorageType.QUOTED");
                anonymousClass092.A0g(null);
            }
        }
        this.A0K = anonymousClass092;
    }

    public void A0h(C05530Pc c05530Pc) {
        A0D().A00 = c05530Pc;
        this.A0t |= 8;
    }

    public void A0i(C05610Pk c05610Pk) {
        this.A0N = c05610Pk;
        if (c05610Pk != null) {
            A0U(2048);
            return;
        }
        this.A05 = (2048 ^ (-1)) & this.A05;
    }

    public void A0j(Long l) {
        this.A0Q = l;
    }

    public void A0l(String str) {
        synchronized (this.A0o) {
            this.A0X = str;
            this.A0l = null;
        }
    }

    public void A0m(String str) {
        this.A05 &= -65;
    }

    public void A0n(String str) {
        AbstractC005302j abstractC005302j = this.A0n.A00;
        if (C003101m.A0P(abstractC005302j) && !C003101m.A0Z(abstractC005302j) && str != null) {
            A0u(C003101m.A0F(UserJid.class, Arrays.asList(str.split(","))));
        } else if (C003101m.A0Z(abstractC005302j)) {
            A0d(C003101m.A06(str));
        } else if (TextUtils.isEmpty(str)) {
            A0d(null);
        } else {
            A0d(AbstractC005302j.A02(str));
        }
    }

    public void A0u(List list) {
        this.A0G = null;
        this.A0d = list;
    }

    public final void A0v(List list) {
        if (list != null && !list.isEmpty()) {
            this.A0c = new ArrayList(list);
            this.A0t |= 1;
            return;
        }
        this.A0c = null;
    }

    public void A0w(byte[] bArr) {
        synchronized (this.A0o) {
            this.A0l = bArr;
            this.A0X = null;
            this.A01 = 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x000a, code lost:
        if (r3.A0l != null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0z() {
        /*
            r3 = this;
            java.lang.Object r2 = r3.A0o
            monitor-enter(r2)
            java.lang.String r0 = r3.A0X     // Catch: java.lang.Throwable -> Lf
            if (r0 != 0) goto Lc
            byte[] r1 = r3.A0l     // Catch: java.lang.Throwable -> Lf
            r0 = 0
            if (r1 == 0) goto Ld
        Lc:
            r0 = 1
        Ld:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lf
            return r0
        Lf:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lf
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass092.A0z():boolean");
    }

    public boolean A10() {
        return this.A02 > 0;
    }

    public boolean A11() {
        long j = 8;
        return (this.A0t & j) == j;
    }

    public boolean A12() {
        List list = this.A0c;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public boolean A14(int i) {
        return (this.A05 & i) == i;
    }

    public byte[] A15() {
        byte[] bArr;
        String str;
        synchronized (this.A0o) {
            bArr = this.A0l;
            if (bArr == null && (str = this.A0X) != null) {
                if (str != null) {
                    try {
                        bArr = str.getBytes("UTF-8");
                    } catch (UnsupportedEncodingException unused) {
                    }
                    this.A0l = bArr;
                }
                bArr = null;
                this.A0l = bArr;
            }
        }
        return bArr;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" key=");
        sb.append(this.A0n);
        sb.append(" media_wa_type=");
        sb.append((int) this.A0m);
        return sb.toString();
    }
}
