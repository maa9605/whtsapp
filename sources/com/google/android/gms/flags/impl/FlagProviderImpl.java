package com.google.android.gms.flags.impl;

import X.AnonymousClass088;
import X.AnonymousClass170;
import X.BinderC06190Rw;
import X.BinderC06200Rx;
import X.C16O;
import X.C16Q;
import X.C31371cA;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public class FlagProviderImpl extends AnonymousClass170 implements C16Q {
    public boolean zzu;
    public SharedPreferences zzv;

    public FlagProviderImpl() {
        this(0);
        this.zzu = false;
    }

    public FlagProviderImpl(int i) {
        super("com.google.android.gms.flags.IFlagProvider");
    }

    public static C16Q asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.flags.IFlagProvider");
        if (queryLocalInterface instanceof C16Q) {
            return (C16Q) queryLocalInterface;
        }
        return new C31371cA(iBinder);
    }

    @Override // X.AnonymousClass170
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            init(BinderC06200Rx.A01(parcel.readStrongBinder()));
            parcel2.writeNoException();
            return true;
        } else if (i == 2) {
            boolean booleanFlagValue = getBooleanFlagValue(parcel.readString(), parcel.readInt() != 0, parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeInt(booleanFlagValue ? 1 : 0);
            return true;
        } else if (i == 3) {
            int intFlagValue = getIntFlagValue(parcel.readString(), parcel.readInt(), parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeInt(intFlagValue);
            return true;
        } else if (i == 4) {
            long longFlagValue = getLongFlagValue(parcel.readString(), parcel.readLong(), parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeLong(longFlagValue);
            return true;
        } else if (i != 5) {
            return false;
        } else {
            String stringFlagValue = getStringFlagValue(parcel.readString(), parcel.readString(), parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeString(stringFlagValue);
            return true;
        }
    }

    public boolean getBooleanFlagValue(final String str, boolean z, int i) {
        if (this.zzu) {
            final SharedPreferences sharedPreferences = this.zzv;
            final Boolean valueOf = Boolean.valueOf(z);
            try {
                valueOf = (Boolean) AnonymousClass088.A0t(new Callable() { // from class: X.16K
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        return Boolean.valueOf(sharedPreferences.getBoolean(str, valueOf.booleanValue()));
                    }
                });
            } catch (Exception e) {
                String valueOf2 = String.valueOf(e.getMessage());
                Log.w("FlagDataUtils", valueOf2.length() != 0 ? "Flag value not available, returning default: ".concat(valueOf2) : new String("Flag value not available, returning default: "));
            }
            return valueOf.booleanValue();
        }
        return z;
    }

    public int getIntFlagValue(final String str, int i, int i2) {
        if (this.zzu) {
            final SharedPreferences sharedPreferences = this.zzv;
            final Integer valueOf = Integer.valueOf(i);
            try {
                valueOf = (Integer) AnonymousClass088.A0t(new Callable() { // from class: X.16L
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        return Integer.valueOf(sharedPreferences.getInt(str, valueOf.intValue()));
                    }
                });
            } catch (Exception e) {
                String valueOf2 = String.valueOf(e.getMessage());
                Log.w("FlagDataUtils", valueOf2.length() != 0 ? "Flag value not available, returning default: ".concat(valueOf2) : new String("Flag value not available, returning default: "));
            }
            return valueOf.intValue();
        }
        return i;
    }

    public long getLongFlagValue(final String str, long j, int i) {
        if (this.zzu) {
            final SharedPreferences sharedPreferences = this.zzv;
            final Long valueOf = Long.valueOf(j);
            try {
                valueOf = (Long) AnonymousClass088.A0t(new Callable() { // from class: X.16M
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        return Long.valueOf(sharedPreferences.getLong(str, valueOf.longValue()));
                    }
                });
            } catch (Exception e) {
                String valueOf2 = String.valueOf(e.getMessage());
                Log.w("FlagDataUtils", valueOf2.length() != 0 ? "Flag value not available, returning default: ".concat(valueOf2) : new String("Flag value not available, returning default: "));
            }
            return valueOf.longValue();
        }
        return j;
    }

    public String getStringFlagValue(final String str, final String str2, int i) {
        if (this.zzu) {
            final SharedPreferences sharedPreferences = this.zzv;
            try {
                return (String) AnonymousClass088.A0t(new Callable() { // from class: X.16N
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        return sharedPreferences.getString(str, str2);
                    }
                });
            } catch (Exception e) {
                String valueOf = String.valueOf(e.getMessage());
                Log.w("FlagDataUtils", valueOf.length() != 0 ? "Flag value not available, returning default: ".concat(valueOf) : new String("Flag value not available, returning default: "));
                return str2;
            }
        }
        return str2;
    }

    public void init(IObjectWrapper iObjectWrapper) {
        SharedPreferences sharedPreferences;
        Context context = (Context) BinderC06190Rw.A00(iObjectWrapper);
        if (this.zzu) {
            return;
        }
        try {
            final Context createPackageContext = context.createPackageContext("com.google.android.gms", 0);
            synchronized (SharedPreferences.class) {
                sharedPreferences = C16O.A00;
                if (sharedPreferences == null) {
                    sharedPreferences = (SharedPreferences) AnonymousClass088.A0t(new Callable() { // from class: X.16P
                        @Override // java.util.concurrent.Callable
                        public final /* synthetic */ Object call() {
                            return createPackageContext.getSharedPreferences("google_sdk_flags", 0);
                        }
                    });
                    C16O.A00 = sharedPreferences;
                }
            }
            this.zzv = sharedPreferences;
            this.zzu = true;
        } catch (PackageManager.NameNotFoundException unused) {
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            Log.w("FlagProviderImpl", valueOf.length() != 0 ? "Could not retrieve sdk flags, continuing with defaults: ".concat(valueOf) : new String("Could not retrieve sdk flags, continuing with defaults: "));
        }
    }
}
