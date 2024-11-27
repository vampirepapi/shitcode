</>
## Project IDX Configuration -

### Adding Java Support on Nix

This section explains how to add Java support to your Project IDX environment using Nix.

- **Modifying the `dev.nix` file:**

    To enable Java in your IDX workspace, you need to modify the `dev.nix` file, which is located in the `.idx` directory at the root of your project. This file controls the environment configuration for your workspace.

    Here's an example of how to add the Java Development Kit (JDK) 17 to your `dev.nix` file:
  # Add JDK 17:
  ```
  packages = [
    # pkgs.go
    pkgs.python311
    # pkgs.python311Packages.pip
    # pkgs.nodejs_20
    # pkgs.nodePackages.nodemon
    pkgs.jdk17
  ];
```
Explanation:
   
    *  `packages = [...]`: This line defines the list of packages to be installed in your IDX environment.
    *  `pkgs.jdk17`: This specifies the package name for JDK 17 in the Nix package manager.
    *  Comments: You can uncomment the other package lines if you want to add golang,python, nodejs and nodemon to your IDX environment.


- Rebuilding the environment:

    After modifying the `dev.nix` file, you need to rebuild your IDX environment for the changes to take effect. 

    Click on the "Rebuild Environment" button that appears in the notification or popup in IDX, usually in the bottom right corner. This will reconfigure your workspace with the new package configuration, including Java.



