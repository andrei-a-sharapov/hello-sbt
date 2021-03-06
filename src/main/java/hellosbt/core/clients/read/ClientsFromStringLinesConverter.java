package hellosbt.core.clients.read;

import hellosbt.data.clients.Clients;
import java.util.Collection;
import java.util.function.Function;

/**
 * Functional interface that transforms the input Collection of String lines into Clients.
 * Follows the contract of the Java's Function,
 * delegates all implementation details to sub-classes.
 */

@FunctionalInterface
public interface ClientsFromStringLinesConverter<O>
    extends Function<Collection<String>, Clients<O>> {

}
