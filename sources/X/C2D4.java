package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2D4  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2D4 implements C2BV {
    public static volatile C2D4 A02;
    public final C40431sF A00;
    public volatile List A01;

    public C2D4(C40431sF c40431sF) {
        this.A00 = c40431sF;
    }

    public void A00(C0JM c0jm) {
        if (c0jm.A0B == null) {
            Log.e("RecentStickerDBStorage/updateSticker/sticker filehash is null, could not be updated");
            return;
        }
        C0CD A03 = this.A00.A06().A03();
        try {
            String[] strArr = {c0jm.A0B};
            ContentValues contentValues = new ContentValues();
            contentValues.put("url", c0jm.A0E);
            contentValues.put("enc_hash", c0jm.A07);
            contentValues.put("direct_path", c0jm.A05);
            contentValues.put("mimetype", c0jm.A0A);
            contentValues.put("media_key", c0jm.A09);
            contentValues.put("file_size", Integer.valueOf(c0jm.A00));
            contentValues.put("width", Integer.valueOf(c0jm.A03));
            contentValues.put("height", Integer.valueOf(c0jm.A02));
            contentValues.put("emojis", c0jm.A06);
            contentValues.put("is_first_party", Integer.valueOf(c0jm.A0F ? 1 : 0));
            A03.A02.A00("recent_stickers", contentValues, "plaintext_hash = ?", strArr);
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                try {
                    A03.close();
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // X.C2BV
    public C2BY A6l(Object obj, float f) {
        return new C2D6(f, (C2D5) obj);
    }

    @Override // X.C2BV
    public Object AAO(String str) {
        for (C2D6 c2d6 : this.A01) {
            C2D5 c2d5 = c2d6.A01;
            if (str.equals(c2d5.A01)) {
                return c2d5;
            }
        }
        C0JM c0jm = new C0JM();
        c0jm.A0B = str;
        return new C2D5(str, null, c0jm);
    }

    @Override // X.C2BV
    public String AAn(Object obj) {
        return ((C2D5) obj).A01;
    }

    /* JADX WARN: Finally extract failed */
    @Override // X.C2BV
    public List AEi() {
        Cursor A09;
        C000700j.A00();
        ArrayList arrayList = new ArrayList();
        C0CD A022 = this.A00.A06().A02();
        try {
            A09 = A022.A02.A09("recent_stickers", C2D7.A00, null, null, "entry_weight DESC", "loadWeightedStickerIdentifiersFromDB/QUERY_RECENT_STICKER");
            try {
                int columnIndexOrThrow = A09.getColumnIndexOrThrow("plaintext_hash");
                int columnIndexOrThrow2 = A09.getColumnIndexOrThrow("entry_weight");
                int columnIndexOrThrow3 = A09.getColumnIndexOrThrow("hash_of_image_part");
                int columnIndexOrThrow4 = A09.getColumnIndexOrThrow("url");
                int columnIndexOrThrow5 = A09.getColumnIndexOrThrow("enc_hash");
                int columnIndexOrThrow6 = A09.getColumnIndexOrThrow("direct_path");
                int columnIndexOrThrow7 = A09.getColumnIndexOrThrow("mimetype");
                int columnIndexOrThrow8 = A09.getColumnIndexOrThrow("media_key");
                int columnIndexOrThrow9 = A09.getColumnIndexOrThrow("file_size");
                int columnIndexOrThrow10 = A09.getColumnIndexOrThrow("width");
                int columnIndexOrThrow11 = A09.getColumnIndexOrThrow("height");
                int columnIndexOrThrow12 = A09.getColumnIndexOrThrow("emojis");
                try {
                    int columnIndexOrThrow13 = A09.getColumnIndexOrThrow("is_first_party");
                    while (A09.moveToNext()) {
                        try {
                            String string = A09.getString(columnIndexOrThrow);
                            float f = A09.getFloat(columnIndexOrThrow2);
                            String string2 = A09.getString(columnIndexOrThrow3);
                            C0JM c0jm = new C0JM();
                            c0jm.A0B = string;
                            c0jm.A0E = A09.getString(columnIndexOrThrow4);
                            c0jm.A07 = A09.getString(columnIndexOrThrow5);
                            c0jm.A05 = A09.getString(columnIndexOrThrow6);
                            c0jm.A0A = A09.getString(columnIndexOrThrow7);
                            c0jm.A09 = A09.getString(columnIndexOrThrow8);
                            c0jm.A00 = A09.getInt(columnIndexOrThrow9);
                            c0jm.A03 = A09.getInt(columnIndexOrThrow10);
                            c0jm.A02 = A09.getInt(columnIndexOrThrow11);
                            c0jm.A06 = A09.getString(columnIndexOrThrow12);
                            boolean z = true;
                            if (A09.getInt(columnIndexOrThrow13) != 1) {
                                z = false;
                            }
                            c0jm.A0F = z;
                            arrayList.add(new C2D6(f, new C2D5(string, string2, c0jm)));
                        } catch (Throwable th) {
                            th = th;
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                if (A09 != null) {
                                    try {
                                        A09.close();
                                    } catch (Throwable unused) {
                                    }
                                }
                                try {
                                    throw th2;
                                } catch (Throwable th3) {
                                    th = th3;
                                    try {
                                        throw th;
                                    } catch (Throwable th4) {
                                        try {
                                            A022.close();
                                        } catch (Throwable unused2) {
                                        }
                                        throw th4;
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Throwable th7) {
            th = th7;
        }
        try {
            A09.close();
            A022.close();
            this.A01 = arrayList;
            return this.A01;
        } catch (Throwable th8) {
            th = th8;
            throw th;
        }
    }

    @Override // X.C2BV
    public void AQl(List list) {
        C000700j.A00();
        this.A01 = new ArrayList(list);
        List<C2D6> list2 = this.A01;
        C40431sF c40431sF = this.A00;
        C0CD A03 = c40431sF.A06().A03();
        try {
            C0CD A032 = c40431sF.A06().A03();
            A032.A02.A01("recent_stickers", null, null);
            A032.close();
            for (C2D6 c2d6 : list2) {
                ContentValues contentValues = new ContentValues();
                C2D5 c2d5 = c2d6.A01;
                contentValues.put("plaintext_hash", c2d5.A01);
                contentValues.put("entry_weight", Float.valueOf(c2d6.A00));
                contentValues.put("hash_of_image_part", c2d5.A02);
                C0JM c0jm = c2d5.A00;
                contentValues.put("url", c0jm.A0E);
                contentValues.put("enc_hash", c0jm.A07);
                contentValues.put("direct_path", c0jm.A05);
                contentValues.put("mimetype", c0jm.A0A);
                contentValues.put("media_key", c0jm.A09);
                contentValues.put("file_size", Integer.valueOf(c0jm.A00));
                contentValues.put("width", Integer.valueOf(c0jm.A03));
                contentValues.put("height", Integer.valueOf(c0jm.A02));
                contentValues.put("emojis", c0jm.A06);
                int i = 0;
                if (c0jm.A0F) {
                    i = 1;
                }
                contentValues.put("is_first_party", Integer.valueOf(i));
                A03.A02.A04("recent_stickers", contentValues);
            }
            A03.close();
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
