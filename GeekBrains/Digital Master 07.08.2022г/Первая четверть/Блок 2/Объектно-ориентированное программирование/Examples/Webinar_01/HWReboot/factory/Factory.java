package Webinar_01.HWReboot.factory;

import java.util.List;

import Webinar_01.HWReboot.product.Product;

public abstract interface Factory<P extends Product> {

    public abstract List<P> randomBox();

}
