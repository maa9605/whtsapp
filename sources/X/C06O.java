package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.whatsapp.data.ProfilePhotoChange;
import com.whatsapp.jid.UserJid;

/* renamed from: X.06O */
/* loaded from: classes.dex */
public class C06O {
    public static volatile C06O A08;
    public final AbstractC000600i A00;
    public final C05A A01;
    public final C05B A02;
    public final C05E A03;
    public final C06P A04;
    public final C05C A05;
    public final C05L A06;
    public final C05U A07;

    public C06O(C05B c05b, C05A c05a, AbstractC000600i abstractC000600i, C05U c05u, C05C c05c, C05L c05l, C05E c05e, C06P c06p) {
        this.A02 = c05b;
        this.A01 = c05a;
        this.A00 = abstractC000600i;
        this.A07 = c05u;
        this.A05 = c05c;
        this.A06 = c05l;
        this.A03 = c05e;
        this.A04 = c06p;
    }

    public static C06O A00() {
        if (A08 == null) {
            synchronized (C06O.class) {
                if (A08 == null) {
                    A08 = new C06O(C05B.A00(), C05A.A00(), AbstractC000600i.A00(), C05U.A01(), C05C.A00(), C05L.A00(), C05E.A00(), C06P.A00());
                }
            }
        }
        return A08;
    }

    public long A01(AbstractC005302j abstractC005302j) {
        C0CD A03 = this.A03.A03();
        try {
            Cursor A07 = A03.A02.A07(A03() ? "SELECT _id FROM message_system JOIN message_view ON message_view._id = message_system.message_row_id  WHERE chat_row_id = ?  AND action_type = 19" : "SELECT _id FROM message_view WHERE chat_row_id = ? AND from_me = 1 AND message_type = 7 AND media_size = 19", new String[]{String.valueOf(this.A01.A05(abstractC005302j))});
            if (A07.moveToFirst()) {
                long j = A07.getInt(0);
                A07.close();
                A03.close();
                return j;
            }
            A07.close();
            A03.close();
            return -1L;
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

    public final void A02(C04300Jq c04300Jq) {
        long j;
        long j2;
        C05E c05e = this.A03;
        C0CD A04 = c05e.A04();
        try {
            C03790Hb A00 = A04.A00();
            C05L c05l = this.A06;
            C0CF A01 = c05l.A01("INSERT or REPLACE INTO message_system(    message_row_id,    action_type) VALUES (?, ?)");
            A01.A04(1, c04300Jq.A0p);
            A01.A04(2, c04300Jq.A00);
            A01.A01();
            if (c04300Jq instanceof C04450Kf) {
                C0CF A012 = c05l.A01("INSERT or REPLACE INTO message_system_value_change(    message_row_id,    old_data) VALUES (?, ?)");
                A012.A04(1, c04300Jq.A0p);
                String str = ((C04450Kf) c04300Jq).A01;
                if (str == null) {
                    A012.A02(2);
                } else {
                    A012.A05(2, str);
                }
                A012.A01();
            }
            if (c04300Jq instanceof C0LZ) {
                C0CF A013 = c05l.A01("INSERT or REPLACE INTO message_system_value_change(    message_row_id,    old_data) VALUES (?, ?)");
                A013.A04(1, c04300Jq.A0p);
                String str2 = ((C0LZ) c04300Jq).A00;
                if (str2 == null) {
                    A013.A02(2);
                } else {
                    A013.A05(2, str2);
                }
                A013.A01();
            }
            if (c04300Jq instanceof C04360Jw) {
                C0CF A014 = c05l.A01("INSERT or REPLACE INTO message_system_group(    message_row_id,    is_me_joined) VALUES (?, ?)");
                A014.A04(1, c04300Jq.A0p);
                C04360Jw c04360Jw = (C04360Jw) c04300Jq;
                A014.A04(2, c04360Jw.A00);
                A014.A01();
                C0CF A015 = c05l.A01("INSERT or REPLACE INTO message_system_chat_participant(    message_row_id,    user_jid_row_id) VALUES (?, ?)");
                for (UserJid userJid : c04360Jw.A0P()) {
                    long A02 = this.A02.A02(userJid);
                    if (A02 >= 0) {
                        A015.A04(1, c04300Jq.A0p);
                        A015.A04(2, A02);
                        A015.A01();
                    }
                }
            }
            if (c04300Jq instanceof C04390Jz) {
                C04390Jz c04390Jz = (C04390Jz) c04300Jq;
                C0CF A016 = c05l.A01("INSERT or REPLACE INTO message_system_photo_change(    message_row_id,    new_photo_id,    old_photo,    new_photo) VALUES (?, ?, ?, ?)");
                A016.A04(1, c04300Jq.A0p);
                String A19 = c04390Jz.A19();
                if (A19 == null) {
                    A016.A02(2);
                } else {
                    A016.A05(2, A19);
                }
                ProfilePhotoChange profilePhotoChange = c04390Jz.A00;
                if (profilePhotoChange != null) {
                    byte[] bArr = profilePhotoChange.oldPhoto;
                    if (bArr == null) {
                        A016.A02(3);
                    } else {
                        A016.A00.bindBlob(3, bArr);
                    }
                    byte[] bArr2 = c04390Jz.A00.newPhoto;
                    if (bArr2 == null) {
                        A016.A02(4);
                    } else {
                        A016.A00.bindBlob(4, bArr2);
                    }
                    String valueOf = String.valueOf(c04390Jz.A00.newPhotoId);
                    if (valueOf == null) {
                        A016.A02(2);
                    } else {
                        A016.A05(2, valueOf);
                    }
                }
                if (!TextUtils.isEmpty(c04390Jz.A19()) || c04390Jz.A00 != null) {
                    A016.A01();
                }
            }
            if (c04300Jq instanceof C04370Jx) {
                C04370Jx c04370Jx = (C04370Jx) c04300Jq;
                UserJid userJid2 = c04370Jx.A01;
                if (userJid2 != null) {
                    j = this.A02.A02(userJid2);
                } else {
                    j = -1;
                }
                UserJid userJid3 = c04370Jx.A00;
                if (userJid3 != null) {
                    j2 = this.A02.A02(userJid3);
                } else {
                    j2 = -1;
                }
                if (j != -1 || j2 != -1) {
                    C0CF A017 = c05l.A01("INSERT or REPLACE INTO message_system_number_change(    message_row_id,    old_jid_row_id,    new_jid_row_id) VALUES (?, ?, ?)");
                    A017.A04(1, c04300Jq.A0p);
                    A017.A04(2, j);
                    A017.A04(3, j2);
                    A017.A01();
                }
            }
            if (c04300Jq instanceof C04340Ju) {
                C04340Ju c04340Ju = (C04340Ju) c04300Jq;
                C0CF A018 = c05l.A01("INSERT or REPLACE INTO message_system_device_change(    message_row_id,    device_added_count,    device_removed_count) VALUES (?, ?, ?)");
                A018.A04(1, c04340Ju.A0p);
                A018.A04(2, c04340Ju.A00);
                A018.A04(3, c04340Ju.A01);
                A018.A01();
            }
            if (c04300Jq instanceof C04380Jy) {
                C04380Jy c04380Jy = (C04380Jy) c04300Jq;
                C0CF A019 = c05l.A01("INSERT or REPLACE INTO message_system_initial_privacy_provider(message_row_id, privacy_provider, verified_biz_name) VALUES (?, ?, ?)");
                A019.A04(1, c04380Jy.A0p);
                A019.A04(2, c04380Jy.A00);
                if (!TextUtils.isEmpty(c04380Jy.A01)) {
                    A019.A05(3, c04380Jy.A01);
                }
                A019.A01();
            }
            if (c04300Jq instanceof C04590La) {
                C04590La c04590La = (C04590La) c04300Jq;
                C0CF A0110 = c05l.A01("INSERT or REPLACE INTO message_payment(    message_row_id,    sender_jid_row_id,    receiver_jid_row_id,    amount_with_symbol,    remote_message_sender_jid_row_id,    remote_message_from_me,    remote_message_key) VALUES (?, ?, ?, ?, ?, ?, ?)");
                A0110.A04(1, c04300Jq.A0p);
                UserJid A0B = c04590La.A0B();
                if (A0B != null) {
                    A0110.A04(2, this.A02.A02(A0B));
                }
                UserJid userJid4 = c04590La.A00;
                if (userJid4 != null) {
                    A0110.A04(3, this.A02.A02(userJid4));
                }
                String str3 = c04590La.A03;
                if (str3 == null) {
                    A0110.A02(4);
                } else {
                    A0110.A05(4, str3);
                }
                AnonymousClass094 anonymousClass094 = c04590La.A02;
                if (anonymousClass094 != null) {
                    AbstractC005302j abstractC005302j = anonymousClass094.A00;
                    if (abstractC005302j != null) {
                        A0110.A04(5, this.A02.A02(abstractC005302j));
                    }
                    A0110.A04(6, anonymousClass094.A02 ? 1L : 0L);
                    String str4 = anonymousClass094.A01;
                    if (str4 == null) {
                        A0110.A02(7);
                    } else {
                        A0110.A05(7, str4);
                    }
                }
                A0110.A01();
                if (c04300Jq instanceof C04600Lb) {
                    C04600Lb c04600Lb = (C04600Lb) c04300Jq;
                    C0CF A0111 = c05l.A01("INSERT or REPLACE INTO message_payment_transaction_reminder(    message_row_id,    web_stub,    amount,    transfer_date,    payment_sender_name,    expiration,    remote_message_key) VALUES (?, ?, ?, ?, ?, ?, ?)");
                    A0111.A04(1, c04300Jq.A0p);
                    String str5 = c04600Lb.A02;
                    if (str5 == null) {
                        A0111.A02(2);
                    } else {
                        A0111.A05(2, str5);
                    }
                    String str6 = c04600Lb.A01;
                    if (str6 == null) {
                        A0111.A02(3);
                    } else {
                        A0111.A05(3, str6);
                    }
                    String str7 = c04600Lb.A04;
                    if (str7 == null) {
                        A0111.A02(4);
                    } else {
                        A0111.A05(4, str7);
                    }
                    String str8 = c04600Lb.A03;
                    if (str8 == null) {
                        A0111.A02(5);
                    } else {
                        A0111.A05(5, str8);
                    }
                    A0111.A04(6, c04600Lb.A00);
                    A0111.A01();
                }
                if (c04300Jq instanceof C04610Lc) {
                    C04610Lc c04610Lc = (C04610Lc) c04300Jq;
                    C0CF A0112 = c05l.A01("INSERT or REPLACE INTO message_payment_status_update(    message_row_id,    transaction_info,    transaction_data,    init_timestamp,    update_timestamp,    amount_data) VALUES (?, ?, ?, ?, ?, ?)");
                    A0112.A04(1, c04300Jq.A0p);
                    String str9 = c04610Lc.A03;
                    if (str9 == null) {
                        A0112.A02(2);
                    } else {
                        A0112.A05(2, str9);
                    }
                    String str10 = c04610Lc.A01;
                    if (str10 == null) {
                        A0112.A02(3);
                    } else {
                        A0112.A05(3, str10);
                    }
                    String str11 = c04610Lc.A02;
                    if (str11 == null) {
                        A0112.A02(4);
                    } else {
                        A0112.A05(4, str11);
                    }
                    String str12 = c04610Lc.A04;
                    if (str12 == null) {
                        A0112.A02(5);
                    } else {
                        A0112.A05(5, str12);
                    }
                    String str13 = c04610Lc.A00;
                    if (str13 == null) {
                        A0112.A02(6);
                    } else {
                        A0112.A05(6, str13);
                    }
                    A0112.A01();
                }
            }
            if (c04300Jq instanceof AbstractC05550Pe) {
                AbstractC05550Pe abstractC05550Pe = (AbstractC05550Pe) c04300Jq;
                C0CD A042 = this.A04.A00.A04();
                ContentValues contentValues = new ContentValues(3);
                contentValues.put("message_row_id", Long.valueOf(abstractC05550Pe.A0p));
                contentValues.put("service", Integer.valueOf(abstractC05550Pe.A00));
                contentValues.put("invite_used", Boolean.valueOf(abstractC05550Pe.A01));
                A042.A02.A02("message_system_payment_invite_setup", contentValues);
                A042.close();
            }
            if (c04300Jq instanceof C0LW) {
                C0LW c0lw = (C0LW) c04300Jq;
                C0CF A0113 = c05l.A01("INSERT or REPLACE INTO message_system_block_contact(    message_row_id,    is_blocked) VALUES (?, ?)");
                A0113.A04(1, c0lw.A0p);
                A0113.A04(2, c0lw.A00 ? 1L : 0L);
                A0113.A01();
            }
            if (c04300Jq instanceof C0LY) {
                C0LY c0ly = (C0LY) c04300Jq;
                C0CF A0114 = c05l.A01("INSERT or REPLACE INTO message_system_ephemeral_setting_not_applied(message_row_id, setting_duration) VALUES (?, ?)");
                A0114.A04(1, c0ly.A0p);
                A0114.A04(2, c0ly.A00);
                A0114.A01();
            }
            if (c04300Jq instanceof C04320Js) {
                C04320Js c04320Js = (C04320Js) c04300Jq;
                C0CD A043 = c05e.A04();
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("message_row_id", Long.valueOf(c04320Js.A0p));
                contentValues2.put("business_name", c04320Js.A01);
                contentValues2.put("privacy_message_type", Integer.valueOf(c04320Js.A00));
                A043.A02.A02("message_system_business_state", contentValues2);
                A043.close();
            }
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

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0020, code lost:
        if (r7.A05.A01("system_message_ready", 0) == 2) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A03() {
        /*
            r7 = this;
            X.05E r0 = r7.A03
            X.0CD r6 = r0.A03()
            r0.A05()     // Catch: java.lang.Throwable -> L27
            X.05J r0 = r0.A06     // Catch: java.lang.Throwable -> L27
            boolean r0 = r0.A0P(r6)     // Catch: java.lang.Throwable -> L27
            if (r0 != 0) goto L22
            X.05C r3 = r7.A05     // Catch: java.lang.Throwable -> L27
            java.lang.String r2 = "system_message_ready"
            r0 = 0
            long r4 = r3.A01(r2, r0)     // Catch: java.lang.Throwable -> L27
            r2 = 2
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r0 = 0
            if (r1 != 0) goto L23
        L22:
            r0 = 1
        L23:
            r6.close()
            return r0
        L27:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L29
        L29:
            r0 = move-exception
            r6.close()     // Catch: java.lang.Throwable -> L2d
        L2d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06O.A03():boolean");
    }
}
