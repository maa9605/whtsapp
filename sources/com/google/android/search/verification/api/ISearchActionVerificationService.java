package com.google.android.search.verification.api;

import X.AbstractBinderC20880yP;
import X.AbstractC20870yO;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public interface ISearchActionVerificationService extends IInterface {
    int getVersion();

    boolean isSearchAction(Intent intent, Bundle options);

    /* loaded from: classes.dex */
    public abstract class Stub extends AbstractBinderC20880yP implements ISearchActionVerificationService {
        public static final String DESCRIPTOR = "com.google.android.search.verification.api.ISearchActionVerificationService";
        public static final int TRANSACTION_getVersion = 2;
        public static final int TRANSACTION_isSearchAction = 1;

        /* loaded from: classes.dex */
        public class Proxy extends AbstractC20870yO implements ISearchActionVerificationService {
            public Proxy(IBinder remote) {
                super(remote, Stub.DESCRIPTOR);
            }

            @Override // com.google.android.search.verification.api.ISearchActionVerificationService
            public int getVersion() {
                Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken());
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            @Override // com.google.android.search.verification.api.ISearchActionVerificationService
            public boolean isSearchAction(Intent intent, Bundle options) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                if (intent == null) {
                    obtainAndWriteInterfaceToken.writeInt(0);
                } else {
                    obtainAndWriteInterfaceToken.writeInt(1);
                    intent.writeToParcel(obtainAndWriteInterfaceToken, 0);
                }
                if (options == null) {
                    obtainAndWriteInterfaceToken.writeInt(0);
                } else {
                    obtainAndWriteInterfaceToken.writeInt(1);
                    options.writeToParcel(obtainAndWriteInterfaceToken, 0);
                }
                Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
                boolean z = transactAndReadException.readInt() != 0;
                transactAndReadException.recycle();
                return z;
            }
        }

        public Stub() {
            super(DESCRIPTOR);
        }

        public static ISearchActionVerificationService asInterface(IBinder obj) {
            if (obj == null) {
                return null;
            }
            IInterface queryLocalInterface = obj.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface instanceof ISearchActionVerificationService) {
                return (ISearchActionVerificationService) queryLocalInterface;
            }
            return new Proxy(obj);
        }

        @Override // X.AbstractBinderC20880yP
        public boolean dispatchTransaction(int code, Parcel data, Parcel reply, int flags) {
            if (code == 1) {
                boolean isSearchAction = isSearchAction((Intent) (data.readInt() == 0 ? null : (Parcelable) Intent.CREATOR.createFromParcel(data)), (Bundle) (data.readInt() == 0 ? null : (Parcelable) Bundle.CREATOR.createFromParcel(data)));
                reply.writeNoException();
                reply.writeInt(isSearchAction ? 1 : 0);
                return true;
            } else if (code != 2) {
                return false;
            } else {
                int version = getVersion();
                reply.writeNoException();
                reply.writeInt(version);
                return true;
            }
        }
    }
}
