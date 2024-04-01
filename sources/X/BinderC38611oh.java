package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.IMultiInstanceInvalidationCallback;
import androidx.room.IMultiInstanceInvalidationService;
import androidx.room.MultiInstanceInvalidationService;
import java.util.HashMap;

/* renamed from: X.1oh */
/* loaded from: classes.dex */
public class BinderC38611oh extends Binder implements IMultiInstanceInvalidationService {
    public final /* synthetic */ MultiInstanceInvalidationService A00;

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    public BinderC38611oh(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.A00 = multiInstanceInvalidationService;
        attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback;
        IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback2;
        if (i == 1) {
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                iMultiInstanceInvalidationCallback = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                if (queryLocalInterface != null && (queryLocalInterface instanceof IMultiInstanceInvalidationCallback)) {
                    iMultiInstanceInvalidationCallback = (IMultiInstanceInvalidationCallback) queryLocalInterface;
                } else {
                    iMultiInstanceInvalidationCallback = new IMultiInstanceInvalidationCallback(readStrongBinder) { // from class: X.1Uf
                        public IBinder A00;

                        {
                            this.A00 = readStrongBinder;
                        }

                        @Override // androidx.room.IMultiInstanceInvalidationCallback
                        public void AL8(String[] strArr) {
                            Parcel obtain = Parcel.obtain();
                            try {
                                obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                                obtain.writeStringArray(strArr);
                                this.A00.transact(1, obtain, null, 1);
                            } finally {
                                obtain.recycle();
                            }
                        }

                        @Override // android.os.IInterface
                        public IBinder asBinder() {
                            return this.A00;
                        }
                    };
                }
            }
            String readString = parcel.readString();
            int i3 = 0;
            if (readString != null) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = this.A00;
                RemoteCallbackList remoteCallbackList = multiInstanceInvalidationService.A01;
                synchronized (remoteCallbackList) {
                    int i4 = multiInstanceInvalidationService.A00 + 1;
                    multiInstanceInvalidationService.A00 = i4;
                    Integer valueOf = Integer.valueOf(i4);
                    if (remoteCallbackList.register(iMultiInstanceInvalidationCallback, valueOf)) {
                        multiInstanceInvalidationService.A03.put(valueOf, readString);
                        i3 = i4;
                    } else {
                        multiInstanceInvalidationService.A00--;
                    }
                }
            }
            parcel2.writeNoException();
            parcel2.writeInt(i3);
            return true;
        } else if (i == 2) {
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 == null) {
                iMultiInstanceInvalidationCallback2 = null;
            } else {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                if (queryLocalInterface2 != null && (queryLocalInterface2 instanceof IMultiInstanceInvalidationCallback)) {
                    iMultiInstanceInvalidationCallback2 = (IMultiInstanceInvalidationCallback) queryLocalInterface2;
                } else {
                    iMultiInstanceInvalidationCallback2 = new IMultiInstanceInvalidationCallback(readStrongBinder2) { // from class: X.1Uf
                        public IBinder A00;

                        {
                            this.A00 = readStrongBinder2;
                        }

                        @Override // androidx.room.IMultiInstanceInvalidationCallback
                        public void AL8(String[] strArr) {
                            Parcel obtain = Parcel.obtain();
                            try {
                                obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                                obtain.writeStringArray(strArr);
                                this.A00.transact(1, obtain, null, 1);
                            } finally {
                                obtain.recycle();
                            }
                        }

                        @Override // android.os.IInterface
                        public IBinder asBinder() {
                            return this.A00;
                        }
                    };
                }
            }
            int readInt = parcel.readInt();
            MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.A00;
            RemoteCallbackList remoteCallbackList2 = multiInstanceInvalidationService2.A01;
            synchronized (remoteCallbackList2) {
                remoteCallbackList2.unregister(iMultiInstanceInvalidationCallback2);
                multiInstanceInvalidationService2.A03.remove(Integer.valueOf(readInt));
            }
            parcel2.writeNoException();
            return true;
        } else if (i != 3) {
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
            return true;
        } else {
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            int readInt2 = parcel.readInt();
            String[] createStringArray = parcel.createStringArray();
            MultiInstanceInvalidationService multiInstanceInvalidationService3 = this.A00;
            RemoteCallbackList remoteCallbackList3 = multiInstanceInvalidationService3.A01;
            synchronized (remoteCallbackList3) {
                HashMap hashMap = multiInstanceInvalidationService3.A03;
                String str = (String) hashMap.get(Integer.valueOf(readInt2));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return true;
                }
                int beginBroadcast = remoteCallbackList3.beginBroadcast();
                for (int i5 = 0; i5 < beginBroadcast; i5++) {
                    int intValue = ((Integer) remoteCallbackList3.getBroadcastCookie(i5)).intValue();
                    String str2 = (String) hashMap.get(Integer.valueOf(intValue));
                    if (readInt2 != intValue && str.equals(str2)) {
                        try {
                            ((IMultiInstanceInvalidationCallback) remoteCallbackList3.getBroadcastItem(i5)).AL8(createStringArray);
                        } catch (RemoteException e) {
                            Log.w("ROOM", "Error invoking a remote callback", e);
                        }
                    }
                }
                remoteCallbackList3.finishBroadcast();
                return true;
            }
        }
    }
}
