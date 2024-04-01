package X;

import android.content.ContentValues;
import android.database.sqlite.SQLiteConstraintException;
import android.text.TextUtils;
import com.whatsapp.util.Log;

/* renamed from: X.06Y */
/* loaded from: classes.dex */
public class C06Y {
    public static volatile C06Y A0O;
    public final AbstractC000600i A00;
    public final C05T A01;
    public final C06Z A02;
    public final C05A A03;
    public final C013206j A04;
    public final C05B A05;
    public final C012806f A06;
    public final C05S A07;
    public final C06J A08;
    public final C012306a A09;
    public final C012406b A0A;
    public final C05E A0B;
    public final C013106i A0C;
    public final C06R A0D;
    public final C014606x A0E;
    public final C013306k A0F;
    public final C012706e A0G;
    public final C05C A0H;
    public final C05L A0I;
    public final C012906g A0J;
    public final C06Q A0K;
    public final C06S A0L;
    public final C013006h A0M;
    public final C05U A0N;

    public C06Y(C05B c05b, C05A c05a, AbstractC000600i abstractC000600i, C05T c05t, C05U c05u, C05S c05s, C06Q c06q, C06R c06r, C05C c05c, C05L c05l, C06S c06s, C06Z c06z, C012306a c012306a, C012406b c012406b, C05E c05e, C012706e c012706e, C012806f c012806f, C012906g c012906g, C013006h c013006h, C06J c06j, C013106i c013106i, C013206j c013206j, C013306k c013306k, C014606x c014606x) {
        this.A05 = c05b;
        this.A03 = c05a;
        this.A00 = abstractC000600i;
        this.A01 = c05t;
        this.A0N = c05u;
        this.A07 = c05s;
        this.A0K = c06q;
        this.A0D = c06r;
        this.A0H = c05c;
        this.A0I = c05l;
        this.A0L = c06s;
        this.A02 = c06z;
        this.A09 = c012306a;
        this.A0A = c012406b;
        this.A0B = c05e;
        this.A0G = c012706e;
        this.A06 = c012806f;
        this.A0J = c012906g;
        this.A0M = c013006h;
        this.A08 = c06j;
        this.A0C = c013106i;
        this.A04 = c013206j;
        this.A0F = c013306k;
        this.A0E = c014606x;
    }

    public static C06Y A00() {
        if (A0O == null) {
            synchronized (C06Y.class) {
                if (A0O == null) {
                    A0O = new C06Y(C05B.A00(), C05A.A00(), AbstractC000600i.A00(), C05T.A00(), C05U.A01(), C05S.A00(), C06Q.A00(), C06R.A00(), C05C.A00(), C05L.A00(), C06S.A00(), C06Z.A00(), C012306a.A00(), C012406b.A00(), C05E.A00(), C012706e.A00(), C012806f.A00(), C012906g.A01(), C013006h.A00(), C06J.A01(), C013106i.A01(), C013206j.A00(), C013306k.A07(), C014606x.A00());
                }
            }
        }
        return A0O;
    }

    public final ContentValues A01(AnonymousClass092 anonymousClass092, long j, AbstractC005302j abstractC005302j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("message_row_id", Long.valueOf(j));
        C05A c05a = this.A03;
        contentValues.put("parent_message_chat_row_id", Long.valueOf(c05a.A05(abstractC005302j)));
        AnonymousClass094 anonymousClass094 = anonymousClass092.A0n;
        AbstractC005302j abstractC005302j2 = anonymousClass094.A00;
        if (abstractC005302j2 != null) {
            contentValues.put("chat_row_id", Long.valueOf(c05a.A05(abstractC005302j2)));
            contentValues.put("from_me", Integer.valueOf(anonymousClass094.A02 ? 1 : 0));
            AbstractC005302j A0A = anonymousClass092.A0A();
            contentValues.put("sender_jid_row_id", Long.valueOf(A0A == null ? 0L : this.A05.A02(A0A)));
            contentValues.put("key_id", anonymousClass094.A01);
            contentValues.put("timestamp", Long.valueOf(anonymousClass092.A0E));
            contentValues.put("message_type", Integer.valueOf(anonymousClass092.A06()));
            contentValues.put("origin", Integer.valueOf(anonymousClass092.A04));
            contentValues.put("text_data", anonymousClass092.A16());
            contentValues.put("payment_transaction_id", anonymousClass092.A0b);
            contentValues.put("lookup_tables", Long.valueOf(anonymousClass092.A09()));
            return contentValues;
        }
        throw null;
    }

    public void A02(AnonymousClass092 anonymousClass092) {
        AnonymousClass092 A0C = anonymousClass092.A0C();
        if (A0C != null) {
            C000700j.A07(A0C.A09 == 2);
            C0CD A04 = this.A0B.A04();
            try {
                C03790Hb A00 = A04.A00();
                if (A07()) {
                    long j = anonymousClass092.A0p;
                    AbstractC005302j abstractC005302j = anonymousClass092.A0n.A00;
                    if (abstractC005302j != null) {
                        A04.A02.A05("message_quoted", A01(A0C, j, abstractC005302j));
                        A06(anonymousClass092, false);
                    } else {
                        throw null;
                    }
                }
                if (A0C instanceof InterfaceC03910Hq) {
                    C012906g c012906g = this.A0J;
                    InterfaceC03910Hq interfaceC03910Hq = (InterfaceC03910Hq) A0C;
                    long j2 = anonymousClass092.A0p;
                    C000700j.A09(j2 > 0, "TemplateMessageStore/fillQuotedTemplateData/parent message row must be set");
                    A04 = c012906g.A01.A04();
                    try {
                        C0PY ADS = interfaceC03910Hq.ADS();
                        ContentValues contentValues = new ContentValues(3);
                        contentValues.put("message_row_id", Long.valueOf(j2));
                        contentValues.put("content_text_data", ADS.A00);
                        contentValues.put("footer_text_data", ADS.A01);
                        C000700j.A0A(j2 == A04.A02.A06("message_template_quoted", contentValues, 5), "TemplateMessageStore/insertOrUpdateTemplateQuotedData/inserted row should have same row_id");
                        A04.close();
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                }
                A00.A00();
                A00.close();
                A04.close();
            } catch (Throwable th2) {
                try {
                    throw th2;
                } finally {
                }
            }
        }
    }

    public void A03(AnonymousClass092 anonymousClass092) {
        AnonymousClass092 A0C = anonymousClass092.A0C();
        if (A0C != null) {
            C000700j.A07(A0C.A09 == 2);
            C0CD A04 = this.A0B.A04();
            try {
                C03790Hb A00 = A04.A00();
                C0CF A01 = this.A0I.A01("INSERT INTO messages_quotes (key_remote_jid, key_from_me, key_id, status, needs_push, data, timestamp, media_url, media_mime_type, media_wa_type, media_size, media_name, media_caption, media_hash, media_duration, origin, latitude, longitude, thumb_image, remote_resource, received_timestamp, send_timestamp, receipt_server_timestamp, receipt_device_timestamp, raw_data, participant_hash, recipient_count, quoted_row_id, mentioned_jids, multicast_id, edit_version, media_enc_hash, payment_transaction_id, forwarded, preview_type, lookup_tables) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, -1, -1, -1, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                this.A01.A05(A0C, A01);
                long A012 = A01.A01();
                anonymousClass092.A0B = A012;
                if (A012 <= 0) {
                    AbstractC000600i abstractC000600i = this.A00;
                    StringBuilder sb = new StringBuilder();
                    sb.append("quoted message type : ");
                    sb.append(A0C.A06());
                    sb.append(" ,parent message type: ");
                    sb.append(anonymousClass092.A06());
                    abstractC000600i.A09("QuotedMessageStore/insertQuotedMessageInOldTable/Error", sb.toString(), true);
                }
                boolean z = anonymousClass092.A0B > 0;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("QuotedMessageStore/insertQuotedMessageInOldTable/Error insert quoted message; parentMsg.key=");
                sb2.append(anonymousClass092.A0n);
                C000700j.A0A(z, sb2.toString());
                A04(anonymousClass092);
                A00.A00();
                A00.close();
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
        }
    }

    public final void A04(AnonymousClass092 anonymousClass092) {
        C0CD A04;
        AnonymousClass092 A0C = anonymousClass092.A0C();
        if (A0C instanceof C0LN) {
            C06R c06r = this.A0D;
            boolean z = anonymousClass092.A0B > 0;
            StringBuilder A0P = C000200d.A0P("OrderMessageStore/insertOrUpdateQuotedOrderMessageLegacy/message must have quoted_row_id set; key=");
            AnonymousClass094 anonymousClass094 = anonymousClass092.A0n;
            A0P.append(anonymousClass094);
            C000700j.A09(z, A0P.toString());
            AnonymousClass092 A0C2 = anonymousClass092.A0C();
            C000200d.A1L(C000200d.A0P("OrderMessageStore/insertOrUpdateQuotedOrderMessageLegacy/message must be a order message; key="), anonymousClass094, A0C2 instanceof C0LN);
            C000200d.A1L(C000200d.A0P("OrderMessageStore/insertOrUpdateQuotedOrderMessageLegacy/message in main storage; key="), A0C2.A0n, A0C2.A09 == 2);
            try {
                C0CD A042 = c06r.A01.A04();
                C0CF A01 = c06r.A02.A01("INSERT INTO quoted_message_order(message_row_id, order_id, thumbnail, order_title, item_count, status, surface, message, seller_jid, token, currency_code,total_amount_1000) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                c06r.A01(anonymousClass092.A0B, (C0LN) A0C2, A01);
                C000700j.A0A(anonymousClass092.A0B == A01.A01(), "OrderMessageStore/insertOrUpdateQuotedOrderMessageLegacy/inserted row should have same row_id");
                A042.close();
            } catch (SQLiteConstraintException e) {
                StringBuilder sb = new StringBuilder("OrderMessageStore/insertOrUpdateQuotedOrderMessageLegacy/fail to insert. Error message is: ");
                sb.append(e);
                Log.e(sb.toString());
            }
        }
        if (A0C instanceof C04160Iu) {
            C012706e c012706e = this.A0G;
            boolean z2 = anonymousClass092.A0B > 0;
            StringBuilder A0P2 = C000200d.A0P("ProductMessageStore/insertOrUpdateQuotedProductMessageLegacy/message must have quoted_row_id set; key=");
            AnonymousClass094 anonymousClass0942 = anonymousClass092.A0n;
            A0P2.append(anonymousClass0942);
            C000700j.A09(z2, A0P2.toString());
            AnonymousClass092 A0C3 = anonymousClass092.A0C();
            C000200d.A1L(C000200d.A0P("ProductMessageStore/insertOrUpdateQuotedProductMessageLegacy/message must be a product message; key="), anonymousClass0942, A0C3 instanceof C04160Iu);
            C000200d.A1L(C000200d.A0P("ProductMessageStore/insertOrUpdateQuotedProductMessageLegacy/message in main storage; key="), A0C3.A0n, A0C3.A09 == 2);
            A04 = c012706e.A02.A04();
            try {
                C0CF A012 = c012706e.A03.A01("INSERT OR REPLACE INTO quoted_message_product(message_row_id, business_owner_jid, product_id, title, description, currency_code, amount_1000, retailer_id, url, product_image_count, sale_amount_1000) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                c012706e.A02((C04160Iu) A0C3, A012, anonymousClass092.A0B);
                C000700j.A0A(A012.A01() == anonymousClass092.A0B, "ProductMessageStore/insertOrUpdateQuotedProductMessage/inserted row should have same row_id");
                A04.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } finally {
                }
            }
        }
        if (A0C instanceof C10040fC) {
            C06Z c06z = this.A02;
            boolean z3 = anonymousClass092.A0B > 0;
            StringBuilder A0P3 = C000200d.A0P("CatalogMessageStore/insertOrUpdateQuotedCatalogMessageLegacy/message must have quoted_row_id set; key=");
            AnonymousClass094 anonymousClass0943 = anonymousClass092.A0n;
            A0P3.append(anonymousClass0943);
            C000700j.A09(z3, A0P3.toString());
            AnonymousClass092 A0C4 = anonymousClass092.A0C();
            C000200d.A1L(C000200d.A0P("CatalogMessageStore/insertOrUpdateQuotedCatalogMessageLegacy/message must be a catalog message; key="), anonymousClass0943, A0C4 instanceof C10040fC);
            C000200d.A1L(C000200d.A0P("CatalogMessageStore/insertOrUpdateQuotedCatalogMessageLegacy/message in main storage; key="), A0C4.A0n, A0C4.A09 == 2);
            A04 = c06z.A01.A04();
            try {
                C0CF A013 = c06z.A02.A01("INSERT OR REPLACE INTO quoted_message_product(message_row_id, business_owner_jid, title, description) VALUES (?, ?, ?, ?)");
                c06z.A02((C10040fC) A0C4, A013, anonymousClass092.A0B);
                C000700j.A0A(A013.A01() == anonymousClass092.A0B, "CatalogMessageStore/insertOrUpdateQuotedCatalogMessageLegacy/inserted row should have same row_id");
                A04.close();
            } catch (Throwable th2) {
                try {
                    throw th2;
                } finally {
                }
            }
        }
        if (A0C instanceof C04570Ky) {
            C013206j c013206j = this.A04;
            C04570Ky c04570Ky = (C04570Ky) A0C;
            long j = anonymousClass092.A0B;
            A04 = c013206j.A02.A04();
            try {
                A04.A02.A06("message_quoted_group_invite_legacy", c013206j.A03(c04570Ky, j), 5);
                A04.close();
            } catch (Throwable th3) {
                try {
                    throw th3;
                } finally {
                    try {
                        A04.close();
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        if (A0C instanceof C0LU) {
            this.A0C.A07((C0LU) A0C, anonymousClass092.A0B);
        }
        if (A0C instanceof C0LV) {
            this.A0C.A09((C0LV) A0C, anonymousClass092.A0B, "message_quoted_ui_elements_reply_legacy");
        }
        if (A0C instanceof C05510Pa) {
            this.A0C.A05((C05510Pa) A0C, anonymousClass092.A0B, "message_quoted_ui_elements_reply_legacy");
        }
        if (A0C instanceof C09C) {
            C013006h c013006h = this.A0M;
            c013006h.A02(anonymousClass092.A0B, ((C09C) A0C).ADw(), c013006h.A01.A01("INSERT OR REPLACE INTO message_quoted_view_once_media_legacy (message_row_id, state) VALUES (?, ?)"));
        }
        if (A0C instanceof C0LT) {
            C014606x c014606x = this.A0E;
            C0LT c0lt = (C0LT) A0C;
            c014606x.A01(anonymousClass092.A0B, c0lt.A00, c0lt.A01, c014606x.A01.A01("INSERT OR REPLACE INTO messages_quotes_payment_invite_legacy (message_row_id, service, expiration_timestamp) VALUES (?, ?, ?)"));
        }
        if (A0C != null && A0C.A11()) {
            this.A0C.A03(A0C.A0D().A00, anonymousClass092.A0B, "message_quoted_ui_elements");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x00b9, code lost:
        if (r1 == null) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A05(X.AnonymousClass092 r18, long r19) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06Y.A05(X.092, long):void");
    }

    public final void A06(AnonymousClass092 anonymousClass092, boolean z) {
        C000700j.A07(A07());
        AnonymousClass092 A0C = anonymousClass092.A0C();
        if (A0C instanceof C0KD) {
            this.A06.A03((C0KD) A0C, anonymousClass092.A0p);
        }
        if (A0C instanceof AnonymousClass097) {
            this.A08.A0C((AnonymousClass097) A0C, anonymousClass092.A0p);
        }
        if (A0C instanceof C04160Iu) {
            this.A0G.A01((C04160Iu) A0C, anonymousClass092.A0p);
        }
        if (A0C instanceof C10040fC) {
            this.A02.A01((C10040fC) A0C, anonymousClass092.A0p);
        }
        if (A0C instanceof C04570Ky) {
            this.A04.A06((C04570Ky) A0C, anonymousClass092.A0p);
        }
        if (A0C instanceof C0LN) {
            this.A0D.A03((C0LN) A0C, anonymousClass092.A0p);
        }
        if (A0C instanceof C0LU) {
            this.A0C.A07((C0LU) A0C, anonymousClass092.A0p);
        }
        if (A0C instanceof C0LV) {
            this.A0C.A09((C0LV) A0C, anonymousClass092.A0p, "message_quoted_ui_elements_reply");
        }
        if (A0C instanceof C05510Pa) {
            this.A0C.A05((C05510Pa) A0C, anonymousClass092.A0p, "message_quoted_ui_elements_reply");
        }
        if (A0C instanceof C09C) {
            C013006h c013006h = this.A0M;
            c013006h.A02(anonymousClass092.A0p, ((C09C) A0C).ADw(), c013006h.A01.A01("INSERT OR REPLACE INTO message_quoted_view_once_media (message_row_id, state) VALUES (?, ?)"));
        }
        if (A0C != null) {
            if (A0C.A12()) {
                this.A09.A02(A0C, anonymousClass092.A0p);
            }
            if (A0C.A11()) {
                this.A0C.A03(A0C.A0D().A00, anonymousClass092.A0p, "message_quoted_ui_elements");
            }
        }
        if (A0C instanceof C0D8) {
            C06S c06s = this.A0L;
            long j = anonymousClass092.A0p;
            String A18 = ((C0D8) A0C).A18();
            if (!TextUtils.isEmpty(A18)) {
                c06s.A06(A18, j);
            }
        } else if (A0C instanceof C0DA) {
            this.A0L.A04((C0DA) A0C, anonymousClass092.A0p);
        }
        if (A0C instanceof C0JJ) {
            this.A0K.A02(A0C, anonymousClass092.A0p, z);
        }
        if (A0C instanceof C0LT) {
            C014606x c014606x = this.A0E;
            C0LT c0lt = (C0LT) A0C;
            c014606x.A01(anonymousClass092.A0p, c0lt.A00, c0lt.A01, c014606x.A01.A01("INSERT OR REPLACE INTO message_quoted_payment_invite (message_row_id, service, expiration_timestamp) VALUES (?, ?, ?)"));
        }
    }

    public boolean A07() {
        return this.A0H.A01("quoted_message_ready", 0L) == 2;
    }
}
