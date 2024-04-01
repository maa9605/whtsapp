package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.CursorWrapper;
import android.database.sqlite.SQLiteDatabase;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;
import android.os.SystemClock;

/* renamed from: X.0CE */
/* loaded from: classes.dex */
public class C0CE {
    public final SQLiteDatabase A00;
    public final C04Z A01;

    public C0CE(SQLiteDatabase sQLiteDatabase, C04Z c04z) {
        this.A00 = sQLiteDatabase;
        this.A01 = c04z;
    }

    public int A00(String str, ContentValues contentValues, String str2, String[] strArr) {
        if (this.A01 != null) {
            SystemClock.uptimeMillis();
            return this.A00.update(str, contentValues, str2, strArr);
        }
        throw null;
    }

    public int A01(String str, String str2, String[] strArr) {
        if (this.A01 != null) {
            SystemClock.uptimeMillis();
            return this.A00.delete(str, str2, strArr);
        }
        throw null;
    }

    public long A02(String str, ContentValues contentValues) {
        if (this.A01 != null) {
            SystemClock.uptimeMillis();
            return this.A00.insert(str, null, contentValues);
        }
        throw null;
    }

    public long A03(String str, ContentValues contentValues) {
        if (this.A01 != null) {
            SystemClock.uptimeMillis();
            return this.A00.insertOrThrow(str, null, contentValues);
        }
        throw null;
    }

    public long A04(String str, ContentValues contentValues) {
        if (this.A01 != null) {
            SystemClock.uptimeMillis();
            return this.A00.replace(str, null, contentValues);
        }
        throw null;
    }

    public long A05(String str, ContentValues contentValues) {
        if (this.A01 != null) {
            SystemClock.uptimeMillis();
            return this.A00.replaceOrThrow(str, null, contentValues);
        }
        throw null;
    }

    public long A06(String str, ContentValues contentValues, int i) {
        if (this.A01 != null) {
            SystemClock.uptimeMillis();
            return this.A00.insertWithOnConflict(str, null, contentValues, i);
        }
        throw null;
    }

    public Cursor A07(String str, String[] strArr) {
        if (this.A01 != null) {
            SystemClock.uptimeMillis();
            return this.A00.rawQuery(str, strArr);
        }
        throw null;
    }

    public Cursor A08(String str, String[] strArr, C0HE c0he) {
        CancellationSignal cancellationSignal = null;
        if (this.A01 != null) {
            SystemClock.uptimeMillis();
            if (c0he != null) {
                try {
                    cancellationSignal = (CancellationSignal) c0he.A00();
                } catch (Exception e) {
                    if (e instanceof OperationCanceledException) {
                        throw new C0S2();
                    }
                    throw e;
                }
            }
            return new CursorWrapper(this.A00.rawQuery(str, strArr, cancellationSignal)) { // from class: X.0S1
                public static final RuntimeException A00(RuntimeException runtimeException) {
                    return runtimeException instanceof OperationCanceledException ? new C0S2(runtimeException.getMessage()) : runtimeException;
                }

                @Override // android.database.CursorWrapper, android.database.Cursor
                public int getCount() {
                    try {
                        return super.getCount();
                    } catch (RuntimeException e2) {
                        throw A00(e2);
                    }
                }

                @Override // android.database.CursorWrapper, android.database.Cursor
                public boolean isAfterLast() {
                    try {
                        return super.isAfterLast();
                    } catch (RuntimeException e2) {
                        throw A00(e2);
                    }
                }

                @Override // android.database.CursorWrapper, android.database.Cursor
                public boolean isBeforeFirst() {
                    try {
                        return super.isBeforeFirst();
                    } catch (RuntimeException e2) {
                        throw A00(e2);
                    }
                }

                @Override // android.database.CursorWrapper, android.database.Cursor
                public boolean isFirst() {
                    try {
                        return super.isFirst();
                    } catch (RuntimeException e2) {
                        throw A00(e2);
                    }
                }

                @Override // android.database.CursorWrapper, android.database.Cursor
                public boolean isLast() {
                    try {
                        return super.isLast();
                    } catch (RuntimeException e2) {
                        throw A00(e2);
                    }
                }

                @Override // android.database.CursorWrapper, android.database.Cursor
                public boolean move(int i) {
                    try {
                        return super.move(i);
                    } catch (RuntimeException e2) {
                        throw A00(e2);
                    }
                }

                @Override // android.database.CursorWrapper, android.database.Cursor
                public boolean moveToFirst() {
                    try {
                        return super.moveToFirst();
                    } catch (RuntimeException e2) {
                        throw A00(e2);
                    }
                }

                @Override // android.database.CursorWrapper, android.database.Cursor
                public boolean moveToLast() {
                    try {
                        return super.moveToLast();
                    } catch (RuntimeException e2) {
                        throw A00(e2);
                    }
                }

                @Override // android.database.CursorWrapper, android.database.Cursor
                public boolean moveToNext() {
                    try {
                        return super.moveToNext();
                    } catch (RuntimeException e2) {
                        throw A00(e2);
                    }
                }

                @Override // android.database.CursorWrapper, android.database.Cursor
                public boolean moveToPosition(int i) {
                    try {
                        return super.moveToPosition(i);
                    } catch (RuntimeException e2) {
                        throw A00(e2);
                    }
                }

                @Override // android.database.CursorWrapper, android.database.Cursor
                public boolean moveToPrevious() {
                    try {
                        return super.moveToPrevious();
                    } catch (RuntimeException e2) {
                        throw A00(e2);
                    }
                }
            };
        }
        throw null;
    }

    public final Cursor A09(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4) {
        return A0A(str, strArr, str2, strArr2, str3, null);
    }

    public final Cursor A0A(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4) {
        if (this.A01 != null) {
            SystemClock.uptimeMillis();
            return this.A00.query(false, str, strArr, str2, strArr2, null, null, str3, str4);
        }
        throw null;
    }

    public C0CF A0B(String str) {
        if (this.A01 != null) {
            return new C0CF(this.A00.compileStatement(str));
        }
        throw null;
    }

    public void A0C(String str) {
        if (this.A01 != null) {
            SystemClock.uptimeMillis();
            this.A00.execSQL(str);
            return;
        }
        throw null;
    }

    public void A0D(String str, Object[] objArr) {
        if (this.A01 != null) {
            SystemClock.uptimeMillis();
            this.A00.execSQL(str, objArr);
            return;
        }
        throw null;
    }
}
