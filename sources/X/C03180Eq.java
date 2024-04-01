package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.0Eq */
/* loaded from: classes.dex */
public class C03180Eq {
    public static volatile C03180Eq A0B;
    public final AbstractC000600i A00;
    public final AnonymousClass012 A01;
    public final C05Q A02;
    public final C05A A03;
    public final C05M A04;
    public final C05D A05;
    public final C05B A06;
    public final C012406b A07;
    public final C05N A08;
    public final C05E A09;
    public final C06O A0A;

    public C03180Eq(AnonymousClass012 anonymousClass012, C05B c05b, C05A c05a, AbstractC000600i abstractC000600i, C05M c05m, C05Q c05q, C06O c06o, C05D c05d, C012406b c012406b, C05E c05e, C05N c05n) {
        this.A01 = anonymousClass012;
        this.A06 = c05b;
        this.A03 = c05a;
        this.A00 = abstractC000600i;
        this.A04 = c05m;
        this.A02 = c05q;
        this.A0A = c06o;
        this.A05 = c05d;
        this.A07 = c012406b;
        this.A09 = c05e;
        this.A08 = c05n;
    }

    public static C03180Eq A00() {
        if (A0B == null) {
            synchronized (C03180Eq.class) {
                if (A0B == null) {
                    A0B = new C03180Eq(AnonymousClass012.A00(), C05B.A00(), C05A.A00(), AbstractC000600i.A00(), C05M.A00(), C05Q.A00(), C06O.A00(), C05D.A00(), C012406b.A00(), C05E.A00(), C05N.A00());
                }
            }
        }
        return A0B;
    }

    public AnonymousClass092 A01(AbstractC005302j abstractC005302j) {
        if (abstractC005302j == null) {
            Log.e("msgstore/last/message/jid is null");
            return null;
        }
        C05M c05m = this.A04;
        if (c05m.A07(abstractC005302j) == null) {
            C000200d.A0w("msgstore/last/message/no chat for ", abstractC005302j);
            return null;
        }
        C0IT A07 = c05m.A07(abstractC005302j);
        if (A07 != null) {
            long j = A07.A0G;
            if (j != 1) {
                AnonymousClass092 anonymousClass092 = A07.A0O;
                if (anonymousClass092 == null) {
                    AnonymousClass092 A06 = A06(abstractC005302j, j);
                    A07.A0O = A06;
                    return A06;
                }
                return anonymousClass092;
            }
            return null;
        }
        return null;
    }

    public AnonymousClass092 A02(AbstractC005302j abstractC005302j) {
        if (abstractC005302j == null) {
            Log.e("msgstore/last/message/jid is null");
            return null;
        }
        C0IT A07 = this.A04.A07(abstractC005302j);
        if (A07 == null) {
            C000200d.A0w("msgstore/last/message/no chat for ", abstractC005302j);
            return null;
        }
        return A07.A0P;
    }

    public AnonymousClass092 A03(AbstractC005302j abstractC005302j) {
        AnonymousClass092 anonymousClass092 = null;
        if (abstractC005302j == null) {
            Log.e("msgstore/last/message/jid is null");
            return null;
        }
        C05M c05m = this.A04;
        C0IT A07 = c05m.A07(abstractC005302j);
        if (A07 == null) {
            C000200d.A0w("msgstore/last/message/no chat for ", abstractC005302j);
            return null;
        }
        AnonymousClass092 anonymousClass0922 = A07.A0P;
        if (anonymousClass0922 != null) {
            return anonymousClass0922;
        }
        AnonymousClass012 anonymousClass012 = this.A01;
        long A04 = anonymousClass012.A04();
        C0IT A072 = c05m.A07(abstractC005302j);
        if (A072 != null) {
            long j = A072.A0J;
            if (j != 1) {
                anonymousClass092 = A06(abstractC005302j, j);
                C000200d.A0e(anonymousClass012, A04, this.A05, "LastMessageStore/getLastChatsListDisplayedMessageFromDb");
            }
        }
        A07.A0P = anonymousClass092;
        return anonymousClass092;
    }

    public AnonymousClass092 A04(AbstractC005302j abstractC005302j) {
        AnonymousClass012 anonymousClass012 = this.A01;
        long A04 = anonymousClass012.A04();
        AnonymousClass092 anonymousClass092 = null;
        if (abstractC005302j == null) {
            return null;
        }
        String[] strArr = {String.valueOf(this.A03.A05(abstractC005302j))};
        C0CD A03 = this.A09.A03();
        try {
            Cursor A07 = A03.A02.A07(C0HD.A0z, strArr);
            if (A07 != null) {
                if (A07.moveToNext()) {
                    anonymousClass092 = this.A02.A03(A07, abstractC005302j);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("msgstore/last-raw/db no message for ");
                    sb.append(abstractC005302j);
                    Log.w(sb.toString());
                }
                A07.close();
            } else {
                Log.e("msgstore/last-raw/db/cursor is null");
            }
            A03.close();
            C000200d.A0e(anonymousClass012, A04, this.A05, "LastMessageStore/getLastMessageRaw");
            return anonymousClass092;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    A03.close();
                } catch (Throwable unused) {
                }
                throw th2;
            }
        }
    }

    public AnonymousClass092 A05(AbstractC005302j abstractC005302j, int i) {
        AnonymousClass012 anonymousClass012 = this.A01;
        long A04 = anonymousClass012.A04();
        AnonymousClass092 anonymousClass092 = null;
        if (abstractC005302j != null) {
            String[] strArr = {String.valueOf(this.A03.A05(abstractC005302j)), String.valueOf(i)};
            C0CD A03 = this.A09.A03();
            try {
                Cursor A07 = A03.A02.A07(C0HD.A0r, strArr);
                if (A07 == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("msgstore/get/nth no message: ");
                    sb.append(abstractC005302j);
                    sb.append(" ");
                    sb.append(i);
                    Log.i(sb.toString());
                    A03.close();
                    return null;
                }
                if (A07.moveToLast()) {
                    anonymousClass092 = this.A02.A03(A07, abstractC005302j);
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("msgstore/get/nth can't get message: ");
                    sb2.append(abstractC005302j);
                    sb2.append(" ");
                    sb2.append(i);
                    Log.w(sb2.toString());
                }
                this.A05.A01("LastMessageStore/getNthLastMessage", anonymousClass012.A04() - A04);
                A07.close();
                A03.close();
                return anonymousClass092;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        A03.close();
                    } catch (Throwable unused) {
                    }
                    throw th2;
                }
            }
        }
        return null;
    }

    public final AnonymousClass092 A06(AbstractC005302j abstractC005302j, long j) {
        AnonymousClass092 A01 = this.A02.A01(j);
        if (C003101m.A0a(abstractC005302j) && (A01 instanceof C04300Jq)) {
            C04300Jq c04300Jq = (C04300Jq) A01;
            if (c04300Jq.A00 == 2) {
                Log.i("msgstore/initialize/update-group-create-failed-msg");
                C04300Jq A00 = C07A.A00(c04300Jq.A0n, c04300Jq.A0E, 3, this.A00);
                A00.A0l(c04300Jq.A0G());
                A00.A0u(c04300Jq.A0P());
                this.A07.A04(A00);
                return A00;
            }
            return A01;
        }
        return A01;
    }

    /* JADX WARN: Finally extract failed */
    public ArrayList A07(AbstractC005302j abstractC005302j, int i) {
        String str;
        AnonymousClass012 anonymousClass012 = this.A01;
        long A04 = anonymousClass012.A04();
        ArrayList arrayList = new ArrayList();
        if (i == 1) {
            AnonymousClass092 A03 = A03(abstractC005302j);
            if (A03 == null) {
                return arrayList;
            }
            if ((!A03.A0n.A02 || C0ES.A04(A03) || C0DB.A0Y(A03)) && !(A03 instanceof C04280Jo)) {
                if (!(A03 instanceof C09G) || A03.A04 != 1) {
                    arrayList.add(A03);
                    return arrayList;
                }
                C09H c09h = ((AnonymousClass097) A03).A02;
                if (c09h != null && c09h.A0P) {
                    arrayList.add(A03);
                }
                return arrayList;
            }
        }
        C0CD A032 = this.A09.A03();
        try {
            if (this.A0A.A03()) {
                str = C0HD.A0o;
            } else {
                str = C0HD.A0p;
            }
            Cursor A07 = A032.A02.A07(str, new String[]{String.valueOf(this.A03.A05(abstractC005302j)), String.valueOf(i)});
            A08(abstractC005302j, arrayList, A07);
            if (A07 != null) {
                A07.close();
            }
            A032.close();
            C000200d.A0e(anonymousClass012, A04, this.A05, "LastMessageStore/getLastMessagesForNotification");
            return arrayList;
        } finally {
        }
    }

    public final void A08(AbstractC005302j abstractC005302j, ArrayList arrayList, Cursor cursor) {
        if (cursor != null) {
            while (cursor.moveToNext()) {
                try {
                    try {
                        try {
                            AnonymousClass092 A03 = this.A02.A03(cursor, abstractC005302j);
                            if (A03 != null) {
                                if ((A03 instanceof C09G) && A03.A04 == 1) {
                                    C09H c09h = ((AnonymousClass097) ((C09G) A03)).A02;
                                    if (c09h != null && c09h.A0P) {
                                        arrayList.add(A03);
                                    }
                                } else {
                                    arrayList.add(A03);
                                }
                            }
                        } catch (IllegalStateException e) {
                            Log.i("msgstore/getlastmessagesfornotification/IllegalStateException ", e);
                        }
                    } catch (SQLiteDatabaseCorruptException e2) {
                        Log.e(e2);
                        this.A08.A03();
                    }
                } finally {
                    cursor.close();
                }
            }
        }
    }
}
