package org.nseye.multisite

class Account {

    String name
    static constraints = {
	name maxSize: 255
    }
}
