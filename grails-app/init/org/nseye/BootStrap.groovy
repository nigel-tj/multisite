package org.nseye

import org.nseye.multisite.User
import org.nseye.multisite.Role
import org.nseye.multisite.UserRole
    
class BootStrap {

    def init = { servletContext ->
      def adminRole = new Role(authority: 'ROLE_ADMIN').save()
      def testUser = new User(username: 'nseye', password: 'password').save()
      UserRole.create testUser, adminRole

      UserRole.withSession {
        it.flush()
        it.clear()
      }

      assert User.count() == 1
      assert Role.count() == 1
      assert UserRole.count() == 1
    }
    def destroy = {
    }
}
