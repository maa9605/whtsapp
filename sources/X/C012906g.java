package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.06g  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C012906g {
    public static volatile C012906g A02;
    public final AbstractC000600i A00;
    public final C05E A01;

    public C012906g(AbstractC000600i abstractC000600i, C05E c05e) {
        this.A00 = abstractC000600i;
        this.A01 = c05e;
    }

    public static final ContentValues A00(C0PZ c0pz, long j) {
        ContentValues contentValues = new ContentValues(6);
        contentValues.put("message_row_id", Long.valueOf(j));
        contentValues.put("text_data", c0pz.A04);
        contentValues.put("extra_data", c0pz.A05);
        contentValues.put("button_type", Integer.valueOf(c0pz.A03));
        contentValues.put("used", Integer.valueOf(c0pz.A01 ? 1 : 0));
        contentValues.put("selected_index", Integer.valueOf(c0pz.A02));
        return contentValues;
    }

    public static C012906g A01() {
        if (A02 == null) {
            synchronized (C012906g.class) {
                if (A02 == null) {
                    AbstractC000600i A00 = AbstractC000600i.A00();
                    C05L.A00();
                    A02 = new C012906g(A00, C05E.A00());
                }
            }
        }
        return A02;
    }

    public C0PZ A02(long j) {
        C0CD A03 = this.A01.A03();
        try {
            Cursor A07 = A03.A02.A07("SELECT _id, text_data, extra_data, button_type, used, selected_index FROM message_template_button WHERE message_row_id = ?", new String[]{String.valueOf(j)});
            if (A07 != null && A07.moveToFirst()) {
                long j2 = A07.getLong(A07.getColumnIndexOrThrow("_id"));
                C0PZ c0pz = new C0PZ(A07.getString(A07.getColumnIndexOrThrow("text_data")), A07.getString(A07.getColumnIndexOrThrow("extra_data")), A07.getInt(A07.getColumnIndexOrThrow("button_type")), A07.getInt(A07.getColumnIndexOrThrow("used")) == 1, A07.getInt(A07.getColumnIndexOrThrow("selected_index")));
                c0pz.A00 = j2;
                A07.close();
                A03.close();
                return c0pz;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("TemplateMessageStore/getTemplateButtonReplyData/Template button reply data doesn't exist in the table; messageRowId=");
            sb.append(j);
            Log.e(sb.toString());
            if (A07 != null) {
                A07.close();
            }
            A03.close();
            return null;
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

    public void A03(AnonymousClass092 anonymousClass092) {
        C000700j.A09(anonymousClass092 instanceof InterfaceC03910Hq, "TemplateMessageStore/fillTemplateData/message needs to be FMessageTemplate.");
        long j = anonymousClass092.A0p;
        ArrayList arrayList = new ArrayList();
        C0CD A03 = this.A01.A03();
        try {
            C0CE c0ce = A03.A02;
            String valueOf = String.valueOf(j);
            Cursor A07 = c0ce.A07("SELECT content_text_data, footer_text_data FROM message_template WHERE message_row_id = ?", new String[]{valueOf});
            if (A07 != null && A07.moveToFirst()) {
                String string = A07.getString(A07.getColumnIndexOrThrow("content_text_data"));
                String string2 = A07.getString(A07.getColumnIndexOrThrow("footer_text_data"));
                A07.close();
                Cursor A072 = c0ce.A07("SELECT _id, text_data, extra_data, button_type, used, selected_index FROM message_template_button WHERE message_row_id = ?", new String[]{valueOf});
                int columnIndexOrThrow = A072.getColumnIndexOrThrow("_id");
                int columnIndexOrThrow2 = A072.getColumnIndexOrThrow("text_data");
                int columnIndexOrThrow3 = A072.getColumnIndexOrThrow("extra_data");
                int columnIndexOrThrow4 = A072.getColumnIndexOrThrow("button_type");
                int columnIndexOrThrow5 = A072.getColumnIndexOrThrow("used");
                int columnIndexOrThrow6 = A072.getColumnIndexOrThrow("selected_index");
                while (A072.moveToNext()) {
                    long j2 = A072.getLong(columnIndexOrThrow);
                    String string3 = A072.getString(columnIndexOrThrow2);
                    String string4 = A072.getString(columnIndexOrThrow3);
                    int i = A072.getInt(columnIndexOrThrow4);
                    boolean z = false;
                    if (A072.getInt(columnIndexOrThrow5) == 1) {
                        z = true;
                    }
                    C0PZ c0pz = new C0PZ(string3, string4, i, z, A072.getInt(columnIndexOrThrow6));
                    c0pz.A00 = j2;
                    arrayList.add(c0pz);
                }
                A072.close();
                A03.close();
                if (string != null) {
                    if (arrayList.size() == 0) {
                        arrayList = null;
                    }
                    ((InterfaceC03910Hq) anonymousClass092).ATy(new C0PY(string, string2, arrayList));
                    return;
                }
                throw null;
            }
            Log.e("TemplateMessageStore/getTemplateData/no template data in the table.");
            if (A07 != null) {
                A07.close();
            }
            A03.close();
            AbstractC000600i abstractC000600i = this.A00;
            StringBuilder A0P = C000200d.A0P("message.key");
            A0P.append(anonymousClass092.A0n);
            abstractC000600i.A09("TemplateMessageStore/fillTemplateData/template data is missing.", A0P.toString(), true);
            ((InterfaceC03910Hq) anonymousClass092).ATy(new C0PY("", null, null));
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

    public void A04(AnonymousClass092 anonymousClass092) {
        if (anonymousClass092 instanceof InterfaceC03910Hq) {
            if (anonymousClass092.A0p != -1) {
                C05E c05e = this.A01;
                C0CD A04 = c05e.A04();
                try {
                    C03790Hb A00 = A04.A00();
                    InterfaceC03910Hq interfaceC03910Hq = (InterfaceC03910Hq) anonymousClass092;
                    C0PY ADS = interfaceC03910Hq.ADS();
                    ContentValues contentValues = new ContentValues(3);
                    contentValues.put("message_row_id", Long.valueOf(anonymousClass092.A0p));
                    contentValues.put("content_text_data", ADS.A00);
                    contentValues.put("footer_text_data", ADS.A01);
                    C000700j.A0A(A04.A02.A06("message_template", contentValues, 5) == anonymousClass092.A0p, "TemplateMessageStore/insertOrUpdateTemplateData/inserted row should have same row_id");
                    List<C0PZ> list = interfaceC03910Hq.ADS().A02;
                    if (list != null) {
                        for (C0PZ c0pz : list) {
                            long j = anonymousClass092.A0p;
                            A04 = c05e.A04();
                            try {
                                ContentValues A002 = A00(c0pz, j);
                                long j2 = c0pz.A00;
                                if (j2 == -1) {
                                    c0pz.A00 = A04.A02.A02("message_template_button", A002);
                                } else if (A04.A02.A00("message_template_button", A002, "_id = ?", new String[]{String.valueOf(j2)}) != 1) {
                                    Log.e("TemplateMessageStore/insertOrUpdateTemplateButton/fail to update template button.");
                                }
                                A04.close();
                            } finally {
                            }
                        }
                    }
                    A00.A00();
                    A00.close();
                    A04.close();
                    return;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } finally {
                    }
                }
            }
            throw new IllegalArgumentException("main message part must be inserted before");
        }
        throw new IllegalArgumentException("message must be template message");
    }

    public void A05(InterfaceC03910Hq interfaceC03910Hq, long j) {
        C000700j.A09(j > 0, "TemplateMessageStore/fillQuotedTemplateData/parent message row must be set");
        C0CD A03 = this.A01.A03();
        try {
            Cursor A07 = A03.A02.A07("SELECT content_text_data, footer_text_data FROM message_template_quoted WHERE message_row_id = ?", new String[]{String.valueOf(j)});
            if (A07 != null && A07.moveToFirst()) {
                String string = A07.getString(A07.getColumnIndexOrThrow("content_text_data"));
                String string2 = A07.getString(A07.getColumnIndexOrThrow("footer_text_data"));
                A07.close();
                A03.close();
                if (string != null) {
                    interfaceC03910Hq.ATy(new C0PY(string, string2, null));
                    return;
                }
                throw null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("TemplateMessageStore/fillQuotedTemplateData/missing template info for quoted message; rowId=");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
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
}
