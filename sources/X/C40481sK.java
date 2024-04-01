package X;

import android.database.AbstractCursor;
import android.database.Cursor;
import android.net.Uri;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.1sK  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C40481sK extends AbstractCursor {
    public static final String[] A05 = {"_id", "_data", "date", "title", "mime_type", "media_type", "duration"};
    public int A00 = -1;
    public Cursor A01;
    public boolean A02;
    public final C0C9 A03;
    public final AbstractC005302j A04;

    @Override // android.database.AbstractCursor, android.database.Cursor
    public double getDouble(int i) {
        return 0.0d;
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public float getFloat(int i) {
        return 0.0f;
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public int getInt(int i) {
        return 0;
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public int getType(int i) {
        return (i == 0 || i == 2 || i == 5 || i == 6) ? 1 : 3;
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public boolean isNull(int i) {
        return false;
    }

    public C40481sK(C0C9 c0c9, AbstractC005302j abstractC005302j, Cursor cursor, boolean z) {
        this.A03 = c0c9;
        this.A01 = cursor;
        this.A04 = abstractC005302j;
        this.A02 = z;
        moveToPosition(0);
    }

    public AnonymousClass097 A00() {
        AbstractC005302j abstractC005302j = this.A04;
        if (abstractC005302j == null) {
            C0C9 c0c9 = this.A03;
            return (AnonymousClass097) c0c9.A0H.A02(this.A01);
        }
        return (AnonymousClass097) this.A03.A0D(this.A01, abstractC005302j);
    }

    public final boolean A01() {
        C09H c09h;
        File file;
        AnonymousClass097 A00 = A00();
        if (A00 == null || (c09h = A00.A02) == null) {
            return false;
        }
        if ((!A00.A0n.A02 && !c09h.A0P) || (file = c09h.A0F) == null) {
            return this.A02 && (A00 instanceof C0JP) && C0DB.A0r((C09B) A00);
        }
        Uri fromFile = Uri.fromFile(file);
        if (fromFile == null || fromFile.getPath() == null) {
            return false;
        }
        return new File(fromFile.getPath()).exists();
    }

    @Override // android.database.AbstractCursor, android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        this.A01.close();
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public String[] getColumnNames() {
        return A05;
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public int getCount() {
        int i = this.A00;
        return i < 0 ? this.A01.getCount() : i;
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public long getLong(int i) {
        if (i == 0) {
            Cursor cursor = this.A01;
            return cursor.getLong(cursor.getColumnIndexOrThrow("_id"));
        } else if (i == 2) {
            AnonymousClass097 A00 = A00();
            if (A00 != null) {
                return A00.A0E;
            }
            throw null;
        } else if (i != 6) {
            return 0L;
        } else {
            AnonymousClass097 A002 = A00();
            if (A002 != null) {
                return A002.A00;
            }
            throw null;
        }
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public short getShort(int i) {
        if (i != 5) {
            return (short) 0;
        }
        AnonymousClass097 A00 = A00();
        if (A00 != null) {
            return A00.A0m;
        }
        throw null;
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public String getString(int i) {
        C09H c09h;
        File file;
        if (i == 0) {
            Cursor cursor = this.A01;
            return Long.toString(cursor.getLong(cursor.getColumnIndexOrThrow("_id")));
        } else if (i == 1) {
            AnonymousClass097 A00 = A00();
            if (A00 == null || (c09h = A00.A02) == null || (file = c09h.A0F) == null) {
                return "";
            }
            return file.getAbsolutePath();
        } else if (i == 2) {
            AnonymousClass097 A002 = A00();
            if (A002 == null) {
                return "";
            }
            return Long.toString(A002.A0E);
        } else if (i == 3) {
            AnonymousClass097 A003 = A00();
            if (A003 != null) {
                return A003.A1A();
            }
            throw null;
        } else if (i == 4) {
            AnonymousClass097 A004 = A00();
            if (A004 != null) {
                byte b = A004.A0m;
                if (b != 1) {
                    if (b != 2) {
                        if (b != 3) {
                            if (b != 9) {
                                if (b == 13) {
                                    return "image/gif";
                                }
                                if (b == 23 || b == 37 || b == 25) {
                                    return "image/*";
                                }
                                if (b != 26) {
                                    if (b != 28) {
                                        if (b != 29) {
                                            return "";
                                        }
                                        return "image/gif";
                                    }
                                    return "video/*";
                                }
                            }
                            return A004.A07;
                        }
                        return "video/*";
                    }
                    return "audio/*";
                }
                return "image/*";
            }
            throw null;
        } else {
            return "";
        }
    }

    @Override // android.database.AbstractCursor, android.database.CrossProcessCursor
    public boolean onMove(int i, int i2) {
        boolean z;
        boolean z2;
        if (i > (i2 << 1)) {
            this.A01.moveToPosition(-1);
            i = -1;
        }
        while (i2 > i) {
            int i3 = 0;
            while (true) {
                if (!this.A01.moveToNext()) {
                    z2 = false;
                    break;
                } else if (A01()) {
                    z2 = true;
                    break;
                } else {
                    i3++;
                }
            }
            if (i3 > 0) {
                C000200d.A0q("mediacursor/next/skip ", i3);
            }
            if (!z2) {
                this.A00 = i + 1;
                this.A01.moveToPosition(-1);
                C000200d.A1F(new StringBuilder("mediacursor/next/realcount "), this.A00);
                onChange(true);
                return false;
            }
            i++;
        }
        while (i2 < i) {
            int i4 = 0;
            while (true) {
                if (!this.A01.moveToPrevious()) {
                    z = false;
                    break;
                } else if (A01()) {
                    z = true;
                    break;
                } else {
                    i4++;
                }
            }
            if (i4 > 0) {
                C000200d.A0q("mediacursor/prev/skip ", i4);
            }
            if (!z) {
                this.A01.moveToPosition(-1);
                Log.i("mediacursor/prev/notfound");
                onChange(true);
                return false;
            }
            i--;
        }
        return true;
    }
}
